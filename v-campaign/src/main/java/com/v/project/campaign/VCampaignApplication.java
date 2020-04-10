package com.v.project.campaign;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@SpringBootApplication(exclude = JtaAutoConfiguration.class, scanBasePackages = { "com.v.project.campaign" })
@MapperScan("com.v.project.campaign.model.mybatis.mapper")
public class VCampaignApplication
{

    private static final Logger LOGGER = LoggerFactory.getLogger(VCampaignApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(VCampaignApplication.class, args);
        LOGGER.info("=================V Campaign启动完成=================");
    }

}
