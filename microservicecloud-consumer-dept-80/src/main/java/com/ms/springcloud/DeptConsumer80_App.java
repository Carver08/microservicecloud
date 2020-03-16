package com.ms.springcloud;

import com.ms.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author ms_miao
 * @createTime 2020-02-25 14:43
 */
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效(负载均衡策略)，形如：
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration= MySelfRule.class)
public class DeptConsumer80_App {

    public static void  main(String[] args){
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
