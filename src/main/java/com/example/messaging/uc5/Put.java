package com.example.messaging.uc5;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Put {
    @PutMapping("/hello")
    public String sayHelloPut(@RequestBody String name) {
        return "Hello, " + name + " from BridgeLabz (PUT)";
    }
}
