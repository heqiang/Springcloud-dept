package com.hq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka_7001 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEureka_7001.class,args);
    }
}
