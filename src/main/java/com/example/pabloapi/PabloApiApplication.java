package com.example.pabloapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class PabloApiApplication {
    @RequestMapping("/")
    String saludar(){
        return "pablo y ambar se gustan leru leru";
    }
    public static void main(String[] args) {
        SpringApplication.run(PabloApiApplication.class, args);
    }

}
