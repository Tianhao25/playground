package com.samsung.cloud.playground.configurationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * Created by ross.wang on 12/18/17 for project spring-playground.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String... args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
