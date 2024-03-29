package com.example.serviceclient;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 商品服务
 */
@FeignClient(name = "product-service", path = "/api/product/inner")
public interface ProductFeignClient {
}
