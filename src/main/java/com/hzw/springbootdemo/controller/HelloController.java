package com.hzw.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tanghui
 * @date 2024/4/18 9:53
 * @description HelloController
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello 请求");
        return "hello world222";
    }
}
