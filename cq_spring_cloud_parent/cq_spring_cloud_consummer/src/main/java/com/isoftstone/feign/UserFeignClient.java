package com.isoftstone.feign;

import com.isoftstone.entity.User;
import com.isoftstone.fallback.UserFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SPRING-CLOUD-PROVIDER",fallback = UserFallBack.class)
public interface UserFeignClient {

    @RequestMapping("/user/findById.do/{id}")
    public User findById(@PathVariable("id")String id);
}
