package com.v.project.campaign;

import com.v.project.common.exception.handler.DefaultExceptionHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;
import org.springframework.context.annotation.Bean;

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

    @Bean
    public DefaultExceptionHandler exceptionHandler()
    {
        return new DefaultExceptionHandler();
    }

}
