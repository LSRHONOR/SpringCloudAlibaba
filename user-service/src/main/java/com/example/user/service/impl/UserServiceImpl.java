package com.example.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.model.entity.User;
import com.example.model.vo.LoginUserVO;
import com.example.user.mapper.UserMapper;
import com.example.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author LiSiRui
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2024-03-22 11:01:21
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    /**
     * 根据用户名和密码查询用户信息
     *
     * @param username 用户名
     * @param password 密码
     * @return 查询到的用户信息
     */
    public User getUser(String username, String password) {
        // 访问数据库的耗时统计
        long start = System.currentTimeMillis();
        // 构建查询条件
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<User>().eq("username", username).eq("password", password);
        // 从数据库查询用户信息
        User user = getOne(userQueryWrapper);
        // 打印获取用户信息的耗时统计
        log.info("getUser 耗时统计 {}ms", System.currentTimeMillis() - start);
        return user;
    }

    @Override
    public LoginUserVO userLogin(String username, String password, HttpServletRequest request) {
        return null;
    }
}




