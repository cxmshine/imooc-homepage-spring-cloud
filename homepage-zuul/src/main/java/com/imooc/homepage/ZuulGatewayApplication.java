package com.imooc.homepage;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @EnableZuulProxy: 标识当前的应用是Zuul Server
 * @SpringCloudApplication: 用于简化配置的组合注解 (内有@SpringBootApplication)
 * @author xuming
 * @Date 2019/10/30 19:31
 */
@EnableZuulProxy
@SpringCloudApplication
public class ZuulGatewayApplication {
    public static void main(String[] args){
        SpringApplication.run(ZuulGatewayApplication.class, args);
    }
}
