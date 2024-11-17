package com.enba.integrate.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;

@EnableBinding({Source.class, Sink.class})
@SpringBootApplication
public class EnbaStreamApplication {

  public static void main(String[] args) {
    SpringApplication.run(EnbaStreamApplication.class, args);
  }
}
