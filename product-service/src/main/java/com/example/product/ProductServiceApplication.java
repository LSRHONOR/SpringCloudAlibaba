package com.example.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * 商品服务启动类
 */
@SpringBootApplication // Spring Boot 应用标识
@MapperScan("com.example.product.mapper") // 扫描MyBatis Mapper接口的包路径
@ComponentScan("com.example")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.example.serviceclient"})
public class ProductServiceApplication {
    public static void main(String[] args) {
        // 启动 Spring Boot 应用
        SpringApplication.run(ProductServiceApplication.class, args);
    }
}