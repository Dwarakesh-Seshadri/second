package com.example.second;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
    @PostMapping("/receive")
    public Message receiveMessage(@RequestBody Message msg) {
        System.out.println("Second Service received: " + msg.message());
        // Return a response confirming it was handled
        return new Message("Second service processed: " + msg.message());
    }
}
