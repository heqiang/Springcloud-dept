package com.hq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//eureka 和Ribbon 整合以后 客户端
@SpringBootApplication
@EnableEurekaClient
public class ApplicationConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumer_80.class,args);
    }

}
