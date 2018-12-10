package com.example.demo.hello.world;

public class HelloWorldDto {

    private String greting;
    private Long id;
    private double trm;

    public double getTrm() {
        return trm;
    }

    public void setTrm(double trm) {
        this.trm = trm;
    }

    public HelloWorldDto(String greting, Long id, double trm) {
        this.greting = greting;
        this.id = id;
        this.trm=trm;
    }

    public String getGreting() {
        return greting;
    }

    public void setGreting(String greting) {
        this.greting = greting;
    }
}
