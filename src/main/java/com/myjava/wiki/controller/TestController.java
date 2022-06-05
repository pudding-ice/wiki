package com.myjava.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("hello")
    public String hello() {
        return "hello world!";
    }

    @RequestMapping("/login")
    public void login() {
        System.out.println("执行login");
    }
}
