package com.example.orders;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 订单服务启动类
 */
@SpringBootApplication // Spring Boot 应用标识
@MapperScan("com.example.orders.mapper") // 扫描MyBatis Mapper接口的包路径
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.example.serviceclient"})
public class OrdersServiceApplication {
    public static void main(String[] args) {
        // 启动 Spring Boot 应用
        SpringApplication.run(OrdersServiceApplication.class, args);
    }
}