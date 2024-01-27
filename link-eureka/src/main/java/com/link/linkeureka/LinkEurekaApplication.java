package com.link.linkeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LinkEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkEurekaApplication.class, args);
    }

}
