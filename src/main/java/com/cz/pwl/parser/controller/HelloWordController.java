package com.cz.pwl.parser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther: panwl
 * @create: 2018-06-26 11:35
 * @description: 测试springboot搭建
 */
@RestController
@RequestMapping("/hello")
public class HelloWordController {

    @RequestMapping("/sayHello")
    public String sayHelloP(){
        return "Hello world";
    }
}
