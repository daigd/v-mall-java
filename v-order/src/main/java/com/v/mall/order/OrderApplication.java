package com.v.mall.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : daigd
 * @createtime :  2020年07月28日 10:21
 * @description : 订单模块启动类
 */
@SpringBootApplication
public class OrderApplication
{
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderApplication.class);
    
    public static void main(String[] args)
    {
        SpringApplication.run(OrderApplication.class, args);
        LOGGER.info("================= Order Server 启动完成=================");
    }
}
