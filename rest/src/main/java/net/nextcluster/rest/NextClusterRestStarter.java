package net.nextcluster.rest;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NextClusterRestStarter {

    public static void main(String... args) {
        new SpringApplicationBuilder(NextClusterRestStarter.class)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }
}
