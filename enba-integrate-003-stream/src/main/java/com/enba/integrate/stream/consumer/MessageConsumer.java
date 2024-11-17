package com.enba.integrate.stream.consumer;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @StreamListener("input")
    public void receiveMessage(@Payload String message) {
        System.out.println("Received message: " + message);
    }
}