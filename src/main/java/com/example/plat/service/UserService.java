package com.example.plat.service;

import com.example.plat.common.base.BaseService;
import com.example.plat.model.User;

public interface UserService extends BaseService<User> {
    void invalid() throws Exception;
}
