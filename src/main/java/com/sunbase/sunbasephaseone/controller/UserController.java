package com.sunbase.sunbasephaseone.controller;

import com.sunbase.sunbasephaseone.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/user")
public class UserController {

    private UserService userService;

    //Test api
    @GetMapping("/start")
    public String startOfApp (){
        return "Hello, Let's start";
    }
}
