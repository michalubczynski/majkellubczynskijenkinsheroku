package com.example.majkellubczynskijenkinsheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MajkelLubczynskiJenkinsHerokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MajkelLubczynskiJenkinsHerokuApplication.class, args);
    }
    @GetMapping("/")
    public String get() {
        return "Hello Jenkins";
    }
}
