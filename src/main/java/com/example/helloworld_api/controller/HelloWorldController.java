package com.example.helloworld_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("helloworld")
public class HelloWorldController {
    @GetMapping("/greet")
    public String greet(){
        return "Hello World. today's date and time is " + new Date().toString();
    }
}
