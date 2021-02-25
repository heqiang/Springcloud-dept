package com.hq.springcloud.service;

import com.hq.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {
    public  boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public  List<Dept> queryDept();
}
