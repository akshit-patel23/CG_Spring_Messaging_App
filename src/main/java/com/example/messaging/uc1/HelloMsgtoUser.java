package com.example.messaging.uc1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


    @RestController
    public class HelloMsgtoUser {

        @GetMapping("/hello")
        public String sayHello() {
            return "Hello from BridgeLabz";
        }


    }

