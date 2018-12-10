package com.example.demo.hello.world;

public class HelloWorldDto {

    private String greting;
    private Long id;

    public HelloWorldDto(String greting,Long id) {
        this.greting = greting;
        this.id = id;
    }

    public String getGreting() {
        return greting;
    }

    public void setGreting(String greting) {
        this.greting = greting;
    }
}
