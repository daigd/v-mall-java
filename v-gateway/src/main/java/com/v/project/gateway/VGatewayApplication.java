package com.v.project.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VGatewayApplication
{
    private static final Logger LOGGER = LoggerFactory.getLogger(VGatewayApplication.class);
    
    public static void main(String[] args)
    {
        SpringApplication.run(VGatewayApplication.class, args);
        LOGGER.info("=================V Gateway启动完成=================");
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route", r -> r.path("/campaign/**")
                        .uri("http://localhost:8089"))
                .route("path_route_demo", r -> r.path("/demo/**")
                        .filters(f -> f.rewritePath("/demo/(?<segment>.*)",
                                "/${segment}"))
                        .uri("http://localhost:8089"))
                .route("host_route", r -> r.host("*.myhost.org")
                        .uri("http://httpbin.org"))
                .build();
    }

}
