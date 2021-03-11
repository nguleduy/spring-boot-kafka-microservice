package com.example.user.account.service.kafka.producer;

import com.example.user.account.service.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

public class Sender {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

  @Autowired
  private KafkaTemplate<String, User> simpleKafkaTemplate;

  public void send(String topic, User payload) {
    LOGGER.info("sending payload='{}' to topic='{}'", payload, topic);
    simpleKafkaTemplate.send(topic, payload);
  }
}
