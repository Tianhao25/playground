package com.samsung.cloud.playground.springplayground.demoservice.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ross.wang on 12/18/17 for project spring-playground.
 */
@Configuration
public class DemoConfig {
    @Value("${demo.name}")
    public String name;
}
