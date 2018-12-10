package com.example.demo.hello.world;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URL;
import java.util.Optional;

@Service
public class HelloWorldService {


    private RestTemplate restTemplate=new RestTemplate();

  private   static final String URL="https://free.currencyconverterapi.com/api/v5/convert?q=USD_COP&compact=ultra";

    public HelloWorldDto getDtoWithTRM(String name){
        return new HelloWorldDto(name, 1L,getTRM());

    }

    private double getTRM(){
        try {
            TrmDto trm=restTemplate.getForEntity(new URI(URL),TrmDto.class).getBody();
            return trm.getTrm();
        }catch (Exception e){
            e.getStackTrace();
            throw new RuntimeException("No trm");
        }

    }
}
