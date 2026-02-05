package com.lawyer.first_spring_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lawyer.first_spring_test.services.HelloWorldServices;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {

    private HelloWorldServices helloWorldServices;

    public HelloWorldController(HelloWorldServices helloWorldServices){
        this.helloWorldServices = helloWorldServices;
    }

    // GET /hello-world
    @GetMapping
    public String helloWorld() {
        return helloWorldServices.helloWorld();
    }
}
