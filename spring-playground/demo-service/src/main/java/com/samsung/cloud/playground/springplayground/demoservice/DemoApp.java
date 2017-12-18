package com.samsung.cloud.playground.springplayground.demoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by ross.wang on 12/18/17 for project spring-playground.
 */
@SpringBootApplication
@RefreshScope
public class DemoApp {
    public static void main(String... args) {
        SpringApplication.run(DemoApp.class, args);
    }
}
