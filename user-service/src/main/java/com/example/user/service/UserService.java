package com.example.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.model.entity.User;
import com.example.model.vo.LoginUserVO;
import com.example.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author LiSiRui
 * @description 针对表【user】的数据库操作Service
 * @createDate 2024-03-22 11:01:21
 */
public interface UserService extends IService<User> {

    User getUser(String username, String password);

    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    UserVO getUserVO(User user);

    /**
     * 获取脱敏的已登录用户信息
     *
     * @return
     */
    LoginUserVO getLoginUserVO(User user);

    long userRegister(String userAccount, String userPassword, String checkPassword);
}
