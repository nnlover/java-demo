package com.testweb.service;


import demo.com.annotation.MyService;

@MyService
public class HelloService {
    public String sayHello() {
        return "hello,world";
    }
}
