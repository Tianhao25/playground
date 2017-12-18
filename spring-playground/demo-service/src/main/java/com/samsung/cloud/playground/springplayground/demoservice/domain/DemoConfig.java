package com.samsung.cloud.playground.springplayground.demoservice.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Created by ross.wang on 12/18/17 for project spring-playground.
 */
@Component
public class DemoConfig {
    @Value("${demo.name}")
    public String name;
}
