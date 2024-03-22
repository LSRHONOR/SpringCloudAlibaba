package com.example.orders.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.model.dto.order.OrderQueryRequest;
import com.example.model.entity.Orders;

import java.util.List;

/**
 * @author LiSiRui
 * @description 针对表【orders】的数据库操作Service
 * @createDate 2024-03-22 11:16:35
 */
public interface OrdersService extends IService<Orders> {

    List<Orders> getOrder(Integer id);

    QueryWrapper<Orders> getQueryWrapper(OrderQueryRequest orderQueryRequest);
}
