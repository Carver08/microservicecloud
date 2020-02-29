package com.ms.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ms_miao
 * @createTime 2020-02-29 20:26
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //return new RoundRobinRule();  默认的轮询
        return new RoundRobinRule_MySelf();//自定义为每个机器被访问5次才会轮到下一个机器
    }
}
