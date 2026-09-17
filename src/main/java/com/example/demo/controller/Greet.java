package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Greet {
    
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
