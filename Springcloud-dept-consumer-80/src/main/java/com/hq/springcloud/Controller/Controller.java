package com.hq.springcloud.Controller;

import com.hq.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "HTTP://SPRINGCLOUD-PROVIDER-DEPT";

    @RequestMapping("/comsumer/dept/get/{id}")
    public Dept get(@PathVariable("id")Long  id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @PostMapping("/comsumer/dept/add")
    public boolean addDept(Dept dept){
        System.out.println(dept);
        return restTemplate.postForObject(REST_URL_PREFIX+"dept/add",dept,boolean.class);
    }
    @GetMapping("/comsumer/dept/list")
    public List<Dept> queryDept() {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }


}
