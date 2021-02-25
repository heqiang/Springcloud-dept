package com.hq.springcloud.controller;

import com.hq.springcloud.pojo.Dept;
import com.hq.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;


    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod ="hystrixGet")
    public  Dept queryById(@PathVariable("id") Long id){
        Dept  dept = deptService.queryById(id);
        if(dept==null){
            throw  new RuntimeException("id==>"+id+",不存在该用户");
        }
        return  dept;
    }
    //备选方法
    public  Dept  hystrixGet(@PathVariable("id") Long id){
        return  new Dept()
                .setDeptno(id)
                .setDb_name("id==>"+id+",不存在该用户 null")
                .setDb_source("no this database in mysql");
    }

    @GetMapping("/dept/list")
    public  List<Dept> getAll(){
        return  deptService.queryDept();
    }

    @PostMapping("/dept/add")
    public Boolean addDept(@RequestBody Dept dept){
        return  deptService.addDept(dept);
    }


}
