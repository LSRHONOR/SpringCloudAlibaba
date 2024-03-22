package com.example.orders.service.impl;

import com.alibaba.cloud.commons.lang.StringUtils;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.common.common.ErrorCode;
import com.example.common.exception.BusinessException;
import com.example.model.dto.order.OrderQueryRequest;
import com.example.model.entity.Orders;
import com.example.orders.mapper.OrdersMapper;
import com.example.orders.service.OrdersService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiSiRui
 * @description 针对表【orders】的数据库操作Service实现
 * @createDate 2024-03-22 11:16:35
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
        implements OrdersService {

    @Override
    public List<Orders> getOrder(Integer id) {
        return null;
    }

    @Override
    public QueryWrapper<Orders> getQueryWrapper(OrderQueryRequest orderQueryRequest) {
        if (orderQueryRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "请求参数为空");
        }
        Long orderId = orderQueryRequest.getOrderId();
        String orderNum = orderQueryRequest.getOrderNum();
        Integer userId = orderQueryRequest.getUserId();
        QueryWrapper<Orders> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(orderId != null, "order_id", orderId);
        queryWrapper.eq(StringUtils.isNotBlank(orderNum), "order_num", orderNum);
        queryWrapper.eq(userId != null, "user_id", userId);
        return queryWrapper;
    }
}




