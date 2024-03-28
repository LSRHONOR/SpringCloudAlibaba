package com.example.user.controller;

import com.alibaba.nacos.common.utils.StringUtils;
import com.example.common.common.BaseResponse;
import com.example.common.common.ErrorCode;
import com.example.common.common.ResultUtils;
import com.example.common.exception.BusinessException;
import com.example.model.dto.user.UserLoginRequest;
import com.example.model.dto.user.UserRegisterRequest;
import com.example.model.entity.User;
import com.example.model.vo.LoginUserVO;
import com.example.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

/**
 * 用户服务控制器
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 根据用户名和密码获取用户信息的接口
     *
     * @param username 用户名
     * @param password 密码
     * @return 返回封装用户信息的 Result 对象
     */
    @GetMapping("/getUser")
    public BaseResponse<User> getUser(@RequestParam String username, @RequestParam String password) {
        // 调用用户服务获取用户信息
        Optional<User> user = Optional.ofNullable(userService.getUser(username, password));
        // 如果用户信息为空，返回错误信息
        if (!user.isPresent()) {
            throw new BusinessException(ErrorCode.FORBIDDEN_ERROR);
        }
        // 返回成功信息和用户信息
        return ResultUtils.success(user.get());
    }

    @PostMapping("/login")
    public BaseResponse<LoginUserVO> userLogin(@RequestBody UserLoginRequest userLoginRequest, HttpServletRequest request) {
        if (userLoginRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String userAccount = userLoginRequest.getUserAccount();
        String userPassword = userLoginRequest.getUserPassword();
        if (StringUtils.isAnyBlank(userAccount, userPassword)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        LoginUserVO loginUserVO = userService.userLogin(userAccount, userPassword, request);
        return ResultUtils.success(loginUserVO);
    }

    @PostMapping("/register")
    public BaseResponse<Long> userRegister(@RequestBody UserRegisterRequest userRegisterRequest) {
        if (userRegisterRequest == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String userAccount = userRegisterRequest.getUserAccount();
        String userPassword = userRegisterRequest.getUserPassword();
        String checkPassword = userRegisterRequest.getCheckPassword();
        if (StringUtils.isAnyBlank(userAccount, userPassword, checkPassword)) {
            return null;
        }
        long result = userService.userRegister(userAccount, userPassword, checkPassword);
        return ResultUtils.success(result);
    }
}
