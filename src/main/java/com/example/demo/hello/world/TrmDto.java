package com.example.demo.hello.world;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrmDto {
    @JsonProperty("USD_COP")
    private double trm;

    public TrmDto(double trm) {
        this.trm = trm;
    }

    public TrmDto() {
        super();
    }

    public double getTrm() {
        return trm;
    }

    public void setTrm(double trm) {
        this.trm = trm;
    }

}
