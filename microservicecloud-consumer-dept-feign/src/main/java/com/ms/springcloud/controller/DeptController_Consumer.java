package com.ms.springcloud.controller;

import com.ms.springcloud.entity.Dept;
import com.ms.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author ms_miao
 * @createTime 2020-02-25 14:15
 */
@RestController
public class DeptController_Consumer {


    @Autowired
    private DeptClientService service;


    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.service.get(id);
    }
    @RequestMapping(value = "/consumer/dept/list")
    public List list()
    {
        return this.service.list();
    }
    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)
    {
        return this.service.add(dept);
    }
}
