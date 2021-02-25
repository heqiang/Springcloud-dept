package com.hq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ApplicationSpringcloudProvider_8004 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringcloudProvider_8004.class,args);
    }
}
