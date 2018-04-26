package com.itany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @RequestMapping("/login")
    public String login(){

        System.out.println("login");
        return "index";
    }
}
