package com.example.demo_application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    @GetMapping("/bus")
    public String getData() {
        return "Please book your City Busssssssssss tickets instatnly Around the Pune";
    }
}