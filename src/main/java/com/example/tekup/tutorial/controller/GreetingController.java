package com.example.tekup.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting(){
        return "Hi it's me from the other side";
    }
}
