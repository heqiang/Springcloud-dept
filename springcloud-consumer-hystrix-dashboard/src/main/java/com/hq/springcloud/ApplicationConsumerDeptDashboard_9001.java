package com.hq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
//开启dashboard  访问路由：http://localhost:9001/hystrix
@EnableHystrixDashboard
public class ApplicationConsumerDeptDashboard_9001 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumerDeptDashboard_9001.class,args);
    }
}
