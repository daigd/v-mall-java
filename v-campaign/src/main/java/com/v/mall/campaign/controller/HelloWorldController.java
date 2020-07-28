package com.v.mall.campaign.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * @author : DaiGD
 * @createtime :  2019年12月18日 10:43
 * @description :
 */
@RestController
public class HelloWorldController
{
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
    
    @GetMapping("/helloWorld")
    public String hello(HttpServletRequest request)
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(20);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        String host = request.getRemoteHost();
        String reqUri = request.getRequestURI();
        String query = request.getQueryString();
        String method = request.getMethod();
        String msg = "Hello Spring Cloud,I am from " + host + ",uri=" + reqUri + ",method=" + method + ",query=[" + query + "]";
        LOGGER.info("调用helloWorld,返回结果:{}", msg);
        return msg;
    }
}
