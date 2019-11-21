package com.isoftstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ConfigClientController {

    @Value("${version}")
    private String version;

    @RequestMapping("/get.do")
    public String getVersion(){
        return this.version;
    }
}
