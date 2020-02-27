package com.ms.springcloud.cfgbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ms_miao
 * @createTime 2020-02-25 14:10
 */
@Configuration
public class ConfigBean {

    /**
     *      * RestTemplate提供了多种便捷访问远程Http服务的方法
     *      * 是一种简单便捷的访问restful服务模板类，是spring提供的用于访问Rest服务的客户端模板工具集
     *
     **/
    @Bean
    public RestTemplate getRestTemolate(){
        return new RestTemplate();
    }


}
