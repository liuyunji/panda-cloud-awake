package com.yun.awake;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Awake
 * @date 2019/10/9 15:38
 */
@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class BootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootAdminApplication.class,args);
    }
}
