package com.isoftstone.controller;

import com.isoftstone.entity.User;
import com.isoftstone.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consummer")
public class ConsummerController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/findById.do/{id}")
    public User findById(@PathVariable("id")String id){
        return userFeignClient.findById(id);

    }
}
