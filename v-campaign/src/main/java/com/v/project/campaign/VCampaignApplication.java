package com.v.project.campaign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class VCampaignApplication
{

    private static final Logger LOGGER = LoggerFactory.getLogger(VCampaignApplication.class);
    
    public static void main(String[] args)
    {
        SpringApplication.run(VCampaignApplication.class, args);
        LOGGER.info("==================================V Campaign启动完成==================================");
    }

    @GetMapping("/helloWorld")
    public String hello(HttpServletRequest request)
    {
        String host = request.getRemoteHost();
        String reqUri = request.getRequestURI();
        String query = request.getQueryString();
        String method = request.getMethod();
        String msg = "Hello Spring Cloud,I am from " + host + ",uri=" + reqUri + ",method=" + method + ",query=[" + query + "]";
        LOGGER.info("调用helloWorld,返回结果:{}", msg);
        return msg;
    }
}
