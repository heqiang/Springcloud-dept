package com.hq.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//eureka 和Ribbon 整合以后 客户端

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.hq.springcloud"})
public class FeignApplicationConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplicationConsumer_80.class,args);
    }

}
