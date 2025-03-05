package com.example.messaging.uc3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableMessage {
    @GetMapping("/hello/{name}")
    public String sayHellowithpath(@PathVariable String name){
        return "Hello "+name+" from Bridgelabz";
    }
}
