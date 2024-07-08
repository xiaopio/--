package com.abc.controller;

import com.abc.bean.User;
import com.abc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    //注册
    @RequestMapping("/register")
    public String register(User user){
        return userService.register(user);
    }
    //登录
    @RequestMapping("/login")
    public String login(User user){
        return userService.login(user);
    }



}
