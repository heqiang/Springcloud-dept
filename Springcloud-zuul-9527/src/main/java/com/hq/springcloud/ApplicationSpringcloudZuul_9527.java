package com.hq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//网关代理
@EnableZuulProxy
public class ApplicationSpringcloudZuul_9527 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringcloudZuul_9527.class,args);
    }
}
