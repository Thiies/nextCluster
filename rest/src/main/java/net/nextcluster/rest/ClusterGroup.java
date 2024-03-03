package net.nextcluster.rest;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ClusterGroup {

    private String id;
    private String image;

    private int maxOnlineService;
    private int minOnlineService;

    private boolean fallback;
    private boolean maintenance;
    private int mexMemory;

    private String platform;

}
