package com.ms.springcloud.controller;

import com.ms.springcloud.entity.Dept;
import com.ms.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ms_miao
 * @createTime 2020-02-25 12:02
 */
@RestController
public class DeptController{

    @Autowired
    private DeptService service;

    @RequestMapping(value="/dept/add",method=RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return service.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return service.get(id);
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List list(){
        return service.list();
    }
}

