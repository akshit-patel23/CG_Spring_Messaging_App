package com.example.messaging.uc4;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Post {
    @PostMapping("/hello")
    public String sayHelloPost(@RequestBody String name){
        return "Hello, "+ name +" from Bridgelabz (POST)" ;
    }
}
