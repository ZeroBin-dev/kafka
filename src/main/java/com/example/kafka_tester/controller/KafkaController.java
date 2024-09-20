package com.example.kafka_tester.controller;

import com.example.kafka_tester.service.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

  private final KafkaProducer kafkaProducer;

  @GetMapping("/send")
  public String sendMessage(@RequestParam("message") String message) {
    kafkaProducer.sendMessage(message);
    return "Message sent to kafka Topic";
  }
}
