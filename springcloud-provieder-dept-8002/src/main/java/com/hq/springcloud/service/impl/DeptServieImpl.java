package com.hq.springcloud.service.impl;

import com.hq.springcloud.mapper.DeptMapper;
import com.hq.springcloud.pojo.Dept;
import com.hq.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServieImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }
    @Override
    public Dept queryById(Long id) {
        return deptMapper.queryById(id);
    }

    @Override
    public List<Dept> queryDept() {
        return deptMapper.queryDept();
    }
}
