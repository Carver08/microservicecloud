package com.ms.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ms_miao
 * @createTime 2020-02-25 14:10
 */
@Configuration
public class ConfigBean {  //   相当于applicationContext.xml

    /**
     *      * RestTemplate提供了多种便捷访问远程Http服务的方法
     *      * 是一种简单便捷的访问restful服务模板类，是spring提供的用于访问Rest服务的客户端模板工具集
     *
     **/
    @Bean
    @LoadBalanced //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具。
    public RestTemplate getRestTemolate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        //return new RoundRobinRule();//轮询
        return new RandomRule();  //随机
    }
}
