package com.example.plat.controller;

import com.example.plat.model.User;
import com.example.plat.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/user")
public class UserController {
    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser(String id) {
        User u = userService.selectByPrimaryKey(id);
        return u;
    }
}
