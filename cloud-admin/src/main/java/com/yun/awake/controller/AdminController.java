package com.yun.awake.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Awake
 * @date 2019/9/27 11:06
 */
@RestController
public class AdminController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello "+name+",this is cloud-admin";
    }
}
