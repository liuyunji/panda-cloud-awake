package com.yun.awake.controller;

import com.yun.awake.feign.service.AuthFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Awake
 * @date 2019/9/27 11:26
 */
@RestController
public class AuthController {
    @Autowired
    private AuthFeignService authFeignService;

    /**
     * 模拟
     * @param name
     * @return
     */
    @GetMapping("/feignHello/{name}")
    public String hello(@PathVariable String name){
        return authFeignService.hello(name);
    }
}
