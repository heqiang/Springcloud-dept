package com.hq.springcloud.Controller;

import com.hq.springcloud.pojo.Dept;
import com.hq.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/comsumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long  id){
        System.out.println(id);
        return  this.deptClientService.queryById(id);
    }

    @PostMapping("/comsumer/dept/add")
    public boolean addDept(Dept dept){
        return  this.deptClientService.addDept(dept);
    }
    @GetMapping("/comsumer/dept/list")
    public List<Dept> queryDept() {
            return  this.deptClientService.queryAll();
    }



}
