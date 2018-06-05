package com.kukkuz.springboot.basic.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Value("${app.message}")
    private String message;

    @GetMapping("/")
    public String hello() {
        return message;
    }
}