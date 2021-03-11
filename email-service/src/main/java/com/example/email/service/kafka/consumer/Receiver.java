package com.example.email.service.kafka.consumer;

import com.example.email.service.dto.UserDTO;
import com.example.email.service.service.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

public class Receiver {

  private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

  private CountDownLatch latch = new CountDownLatch(1);

  @Autowired
  private MailService mailService;

  @KafkaListener(topics = "${spring.kafka.topic.userRegistered}")
  public void receive(UserDTO payload) {
    LOGGER.info("received payload='{}'", payload);
    mailService.sendSimpleMessage(payload);
    latch.countDown();
  }
}
