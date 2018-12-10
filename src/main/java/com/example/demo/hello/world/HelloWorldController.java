package com.example.demo.hello.world;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Value("${HELLO:Hola}")
    private String greeting;

    @GetMapping("/hello/{name}")
    public String helloWorld(@PathVariable("name")String name){

        return greeting+ " "+name;
    }
}
