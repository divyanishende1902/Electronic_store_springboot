package com.lcwd.electronic.store.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class homeController {

    @GetMapping("/test")
    public String testing(){
        return "Hello for testing";
    }
}
