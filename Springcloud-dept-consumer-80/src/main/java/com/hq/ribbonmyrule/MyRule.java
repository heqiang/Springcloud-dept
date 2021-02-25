package com.hq.ribbonmyrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
* Ribbon配置类必须是@Configuration 不能放在主启动类的同级目录
* 放在住主启动类的同级目录时 会被默认的扫描机制扫描到 然后被所有的客户端client共享 导致不能覆盖默认的Ribbon轮询
*
* */

@Configuration
public class MyRule {
    //自定义负载均衡算法
    @Bean
    public IRule rule(){
        return  new RandomRule();
    }
}
