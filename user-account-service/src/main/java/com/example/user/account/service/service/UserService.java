package com.example.user.account.service.service;

import com.example.user.account.service.entity.User;

public interface UserService {

  User registerUser(User input);

  Iterable<User> findAll();
}
