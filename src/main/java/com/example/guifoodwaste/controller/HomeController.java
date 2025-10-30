package com.example.guifoodwaste.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/create-private-user")
    public String createsPrivateUserPage(){
        return "privateUser";
    }

    @PostMapping("/created-private-user")
    public String createdPrivateUserPage(){
        return "homepage2";

    }


}
