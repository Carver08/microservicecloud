package com.ms.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ms_miao
 * @createTime 2020-02-24 16:30
 */

@SuppressWarnings("serial") //忽略警告
@AllArgsConstructor  //提供全餐构造
@NoArgsConstructor   //提供空参构造
@Data                //提供set get方法
@Accessors(chain = true)  //链式访问
public class Dept implements Serializable {

    private Long deptno;//主键
    private String dname;//部门名称
    private String db_source;//来自哪个数据库，因为微服务架构可以一个服务对应一个数据库

}

