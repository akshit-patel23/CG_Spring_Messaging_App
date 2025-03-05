package com.example.messaging.uc2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryMessage {
    @GetMapping("/hello/query")
    public String sayHellowithquery(@RequestParam String name){
        return "Hello "+name+" from Bridgelabz";
    }
}
