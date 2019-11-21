package com.isoftstone.controller;

import com.isoftstone.entity.User;
import com.isoftstone.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/findById.do/{id}")
    public User findById(@PathVariable("id") String id){
        User user = userMapper.selectById(id);
        return user;
    }

}
