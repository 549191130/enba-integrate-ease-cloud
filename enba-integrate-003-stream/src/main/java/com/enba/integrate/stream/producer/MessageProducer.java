package com.enba.integrate.stream.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageProducer {

    @Autowired
    private StreamBridge streamBridge;

    @GetMapping("/send")
    public String sendMessage(String message) {
        streamBridge.send("output", message);
        return "Message sent: " + message;
    }
}