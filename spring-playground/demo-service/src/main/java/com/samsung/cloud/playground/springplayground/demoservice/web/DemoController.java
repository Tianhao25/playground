package com.samsung.cloud.playground.springplayground.demoservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ross.wang on 12/18/17 for project spring-playground.
 */
@RestController
@RefreshScope
public class DemoController {
    @Value("${demo.name}")
    public String name;

    @RequestMapping("/hello")
    public String hello() {
        return name;
    }
}
