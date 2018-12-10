package com.example.demo.hello.world;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${HELLO:Hola}")
    private String greeting;

    @Autowired
    private HelloWorldService service;

    @GetMapping("/hello/{name}")
    public HelloWorldDto helloWorld(@PathVariable("name") String name) {

        return service.getDtoWithTRM(greeting + "" + name);
    }
}