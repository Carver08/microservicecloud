package com.ms.springcloud.dao;

import com.ms.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ms_miao
 * @createTime 2020-02-25 11:46
 */
@Mapper
public interface DeptDao {

        public boolean addDept(Dept dept);

        public Dept findById(Long id);

        public List findAll();
}