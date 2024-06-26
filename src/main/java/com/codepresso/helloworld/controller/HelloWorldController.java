package com.codepresso.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/")
    public String hello() {
        return "<h1>Hello Spring Boot!<h1>";
    }
}
