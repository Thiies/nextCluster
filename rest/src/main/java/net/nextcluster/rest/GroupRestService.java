package net.nextcluster.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/group")
public final class GroupRestService {

    @GetMapping("/list")
    public List<ClusterGroup> findGroup() {
        return List.of(
                new ClusterGroup("lobby", "lobby", 1,1,
                        false, false, 512, "PAPER"),
                new ClusterGroup("proxy", "proxy", 1,1,
                        false, true, 1024, "VELOCITY"),
                new ClusterGroup("bw-2x1", "bw-2x1", 1,1,
                        false, false, 512, "MINESTOM"));
    }

    @GetMapping("/group")
    public ClusterGroup findGroup(@RequestParam String id) {
        return new ClusterGroup(id, id, 1,1, false, true, 512, "PAPER");
    }

    @DeleteMapping("/delete")
    public void deleteGroup(@RequestParam String id) {
        // test: nothing
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createGroup(@RequestParam String id,
                                              @RequestParam(defaultValue = "1") int maxOnline,
                                              @RequestParam(defaultValue = "1") int minOnline,
                                              @RequestParam(defaultValue = "false") boolean fallback,
                                              @RequestParam(defaultValue = "512") int maxMemory,
                                              @RequestParam(defaultValue = "CUSTOM") String platform) {
        return ResponseEntity.ok().build();
    }
}