package com.example.kafka_tester.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  @KafkaListener(topics = "test_topic", groupId = "test-group")
  public void listen(String message) {
    System.out.println("Consumed message : " + message);
  }
}
