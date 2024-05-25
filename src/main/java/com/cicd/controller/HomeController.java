package com.cicd.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {
    
    @GetMapping("/welcome")
    public String printGreeting(){
        return "Welcome to CI-CD learning";
    }
}
