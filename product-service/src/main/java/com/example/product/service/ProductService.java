package com.example.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.model.entity.Product;
import com.example.model.entity.User;
import com.example.model.vo.LoginUserVO;
import com.example.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author LiSiRui
 * @description 针对表【Product】的数据库操作Service
 * @createDate 2024-03-22 11:01:21
 */
public interface ProductService extends IService<Product> {

}
