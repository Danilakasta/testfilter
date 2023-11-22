package com.example.testcat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TestController {

    @GetMapping("health/check")
    public String health() {

        return "ok";
    }


    @PostMapping("health/error")
    public String error() throws IllegalAccessException {

        throw new IllegalAccessException("Ошибка!!!");
    }
}
