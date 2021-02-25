package com.hq.springcloud.config;

import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//@Configuration -- spring applicationContext.xml
@Configuration
public class ConfigBean {
    //配置负载均衡实现RestTemplate
    // IRule
    // RoundRobinRule 轮询 默认方式
    // AvailabilityFilteringRule 过滤掉跳闸或者访问过慢的服务 然后对剩下的进行轮询
    // RandomRule 随机
    // RetryRule 重试 会先按照轮询获取服务 获取失败后会在指定的时间内重试
    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }


}
