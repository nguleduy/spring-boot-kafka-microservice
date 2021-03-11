package com.example.user.account.service.service.impl;

import com.example.user.account.service.entity.User;
import com.example.user.account.service.kafka.producer.Sender;
import com.example.user.account.service.repository.UserRepository;
import com.example.user.account.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Value("${spring.kafka.topic.userRegistered}")
  private String USER_REGISTERED_TOPIC;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private Sender sender;

  @Override
  public User registerUser(User input) {
    User createdUser = userRepository.save(input);
    sender.send(USER_REGISTERED_TOPIC, createdUser);
    return createdUser;
  }

  @Override
  public Iterable<User> findAll() {
    return userRepository.findAll();
  }
}
