package com.isoftstone.fallback;

import com.isoftstone.entity.User;
import com.isoftstone.feign.UserFeignClient;
import org.springframework.stereotype.Component;

@Component
public class UserFallBack implements UserFeignClient {
    @Override
    public User findById(String id) {
        User user = new User();
        user.setName("系统异常，请稍后再试");
        return user;
    }
}
