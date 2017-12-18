package com.samsung.cloud.playground.springplayground.demoservice.web;

import com.samsung.cloud.playground.springplayground.demoservice.domain.DemoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ross.wang on 12/18/17 for project spring-playground.
 */
@RestController
public class DemoController {
    @Autowired
    private DemoConfig demoConfig;

    @RequestMapping("/hello")
    public String hello() {
        return demoConfig.name;
    }
}
