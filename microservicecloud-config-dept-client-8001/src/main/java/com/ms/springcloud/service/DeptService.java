package com.ms.springcloud.service;

import com.ms.springcloud.entity.Dept;

import java.util.List;

/**
 * @author ms_miao
 * @createTime 2020-02-25 11:57
 */
public interface DeptService{

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List list();
}
