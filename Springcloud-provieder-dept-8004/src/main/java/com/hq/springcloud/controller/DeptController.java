package com.hq.springcloud.controller;

import com.hq.springcloud.pojo.Dept;
import com.hq.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept(@RequestBody Dept dept){
        return  deptService.addDept(dept);
    }
    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id) {
        return deptService.queryById(id);
    }
    @GetMapping("/dept/list")
    public List<Dept> queryDept() {
        return deptService.queryDept();
    }

    @RequestMapping("/dept/discovery")
    public Object discovery(){

        List<String> listService= client.getServices();
        System.out.println("discovery==>service"+listService);
        List<ServiceInstance> instans=client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instan : instans) {
            System.out.println(
                    instan.getHost()+"\n"+
                            instan.getPort()+"\n"+
                            instan.getUri()+"\n"+
                            instan.getServiceId()+"\n"
            );
        }
        return this.client;
    }

}
