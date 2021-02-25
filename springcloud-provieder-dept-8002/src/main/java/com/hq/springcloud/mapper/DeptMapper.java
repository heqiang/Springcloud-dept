package com.hq.springcloud.mapper;

import com.hq.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper {
     public  boolean addDept(Dept dept);

     public Dept queryById(Long id);

     public  List<Dept> queryDept();

}
