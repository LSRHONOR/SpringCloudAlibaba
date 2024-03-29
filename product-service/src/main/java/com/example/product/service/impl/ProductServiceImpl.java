package com.example.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.model.entity.Product;
import com.example.product.mapper.ProductMapper;
import com.example.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author LiSiRui
 * @description 针对表【Product】的数据库操作Service实现
 * @createDate 2024-03-22 11:01:21
 */
@Service
@Slf4j
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {


}




