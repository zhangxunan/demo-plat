package com.example.plat.service.impl;

import com.example.plat.common.base.AbstractBaseService;
import com.example.plat.mapper.UserMapper;
import com.example.plat.model.User;
import com.example.plat.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;

@Service
@Transactional
public class UserServiceImpl extends AbstractBaseService<User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Mapper getMapper() {
        return userMapper;
    }

    @Override
    public void invalid() throws Exception {

    }


}
