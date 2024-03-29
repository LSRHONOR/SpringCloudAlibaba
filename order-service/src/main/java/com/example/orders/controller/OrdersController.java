package com.example.orders.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.common.common.BaseResponse;
import com.example.common.common.ResultUtils;
import com.example.model.dto.order.OrderQueryRequest;
import com.example.model.entity.Orders;
import com.example.model.entity.User;
import com.example.orders.service.OrdersService;
import com.example.serviceclient.UserFeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class OrdersController {

    @Resource
    private OrdersService ordersService;

    @Resource
    private UserFeignClient userFeignClient;

    @PostMapping("/getOrder")
    public BaseResponse<Page<Orders>> getOrder(@RequestBody OrderQueryRequest orderQueryRequest, HttpServletRequest request) {
        User loginUser = userFeignClient.getLoginUser(request);
        orderQueryRequest.setUserId(loginUser.getUserId());
        long current = orderQueryRequest.getCurrent();
        long pageSize = orderQueryRequest.getPageSize();
        Page<Orders> ordersPage = ordersService.page(new Page<>(current, pageSize), ordersService.getQueryWrapper(orderQueryRequest));
        return ResultUtils.success(ordersPage);
    }
}
