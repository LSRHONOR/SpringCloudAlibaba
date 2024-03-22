package com.example.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 网关服务启动类
 */
@SpringBootApplication  // Spring Boot 应用标识
public class GatewayServiceApplication {
    public static void main(String[] args) {
        // 启动 Spring Boot 应用
        SpringApplication.run(GatewayServiceApplication.class, args);
    }
}