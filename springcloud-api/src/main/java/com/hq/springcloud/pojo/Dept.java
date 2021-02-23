package com.hq.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

//实体类
@Data
@NoArgsConstructor
//链式写法
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String db_name;

    private String db_source;

    public Dept(String db_name) {
        this.db_name = db_name;
    }
/*
* 链式写法
* Dept dept = new dept()
* dept.setDeptno(11).setDb_name("ss")
* */


}
