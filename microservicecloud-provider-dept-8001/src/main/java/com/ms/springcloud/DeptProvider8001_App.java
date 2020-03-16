package com.ms.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ms_miao
 * @createTime 2020-02-25 12:09
 */

@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
public class DeptProvider8001_App {

    public static void main(String[] args){

        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}