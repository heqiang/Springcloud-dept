package com.hq.springcloud;

import com.hq.ribbonmyrule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientName;
import org.springframework.context.annotation.ComponentScan;

//eureka 和Ribbon 整合以后 客户端
@SpringBootApplication
@EnableEurekaClient
//指定改造的应用名 configuration->在微服务启动的时候加载我们的配置类 也就是Ribbon类
@RibbonClient(name ="SPRINGCLOUD-PROVIDER-DEPT",configuration = MyRule.class)
public class ApplicationConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConsumer_80.class,args);
    }

}
