package com.changgou.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述
 *
 * @author guoli
 * @data 2021-08-25 20:42
 */
@SpringBootApplication
@EnableEurekaClient
public class Pay0825Application {
    public static void main(String[] args) {
        SpringApplication.run(Pay0825Application.class, args);
    }
}

