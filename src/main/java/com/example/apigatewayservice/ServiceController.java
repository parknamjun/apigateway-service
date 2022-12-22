package com.example.apigatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class ServiceController {
    @GetMapping("/world")
    public String world() {
        System.out.println("Hello World");
        return "Hello World";
    }
}
