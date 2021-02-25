package com.hq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableCircuitBreaker //对熔断的支持
public class DeptHystrixSpringcloudProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptHystrixSpringcloudProvider_8001.class,args);
    }
}
