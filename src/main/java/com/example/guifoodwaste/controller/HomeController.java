package com.example.guifoodwaste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "homepage1";
    }

    @GetMapping("/create-user")
    public String createUserPage(){
        return "createUser";
    }


}
