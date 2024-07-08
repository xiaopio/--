package com.abc.service;

import com.abc.bean.User;
import com.abc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    //注册
    public String register(User user) {
        User user1 = userMapper.findUserByName(user.getName());
        if(user1==null){
            int k = userMapper.addUser(user);
            if(k>0){
                return "注册成功";
            }else{
                return "注册失败,系统发生未知错误,请联系系统管理员";
            }
        }else{
            return "用户名已存在";
        }
    }
    //登录
    public String login(User user) {
        User user1 = userMapper.findUserByName(user.getName());
        if(user1==null){
            return "用户名不存在";
        }else{
            if(user1.getPass().equals(user.getPass())){
                return "登录成功";
            }else{
                return "密码错误";
            }
        }
    }


}
