package com.example.product.controller;

import com.example.product.service.ProductService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 商品服务控制器
 */
@RestController
public class ProductController {

    @Resource
    private ProductService productService;


}
