package com.jms.activemq.controller;

import com.jms.activemq.entity.User;
import com.jms.activemq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser")
    public User getUser(Integer userId) {
        if (userId == null) {
            userId = 1;
        }
        return userMapper.getById(userId);
    }

    @RequestMapping("/saveUser")
    public User saveUser(User user) {
        userMapper.save(user);
        return user;
    }

}
