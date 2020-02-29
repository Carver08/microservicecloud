package com.ms.springcloud.service;

import com.ms.springcloud.dao.DeptDao;
import com.ms.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ms_miao
 * @createTime 2020-02-25 11:59
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept){
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id){
        return dao.findById(id);
    }

    @Override
    public List list(){
        return dao.findAll();
    }
}
