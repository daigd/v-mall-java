package com.v.mall.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : DaiGD
 * @createtime :  2020年08月06日 11:39
 * @description : 网关启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class GatewayApplication
{
    public static void main(String[] args)
    {
        new SpringApplicationBuilder(GatewayApplication.class).run(args);
        log.info("================ v-gateway 启动成功==============");
    }
}
