package com.ms.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ms_miao
 * @createTime 2020-02-25 14:43
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.ms.springcloud"})
@ComponentScan("com.ms.springcloud")
public class DeptConsumer80_Feign_App {

    public static void  main(String[] args){
        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
