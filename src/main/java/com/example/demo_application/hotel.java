package com.example.demo_application;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hotel {

    @GetMapping("/hotel")
    public String getData() {return "Please book your bus tickets Online instatnly for Pune Inter City travel"; }
}
