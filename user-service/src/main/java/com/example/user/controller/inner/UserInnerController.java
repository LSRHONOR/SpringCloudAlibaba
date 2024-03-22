package com.example.user.controller.inner;

import com.example.model.entity.User;
import com.example.serviceclient.UserFeignClient;

import java.util.Collection;
import java.util.List;

public class UserInnerController implements UserFeignClient {
    @Override
    public User getById(long userId) {
        return null;
    }

    @Override
    public List<User> listByIds(Collection<Long> idList) {
        return null;
    }
}
