package com.nsc.brazil.bmteommp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BmteommpApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmteommpApplication.class, args);
    }


    @GetMapping("/hello")
    public String Helllo(){
        return "Spring Boot.";
    }

}
