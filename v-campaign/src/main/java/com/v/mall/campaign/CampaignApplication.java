package com.v.mall.campaign;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@SpringBootApplication(exclude = JtaAutoConfiguration.class,scanBasePackages = {"com.v.project.campaign"})
@MapperScan("com.v.project.campaign.model.mybatis.mapper")
public class CampaignApplication
{

    private static final Logger LOGGER = LoggerFactory.getLogger(CampaignApplication.class);
    
    public static void main(String[] args)
    {
        SpringApplication.run(CampaignApplication.class, args);
        LOGGER.info("================= Campaign Server 启动完成=================");
    }

    
}
