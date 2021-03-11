package com.example.email.service.service;

import com.example.email.service.dto.UserDTO;

public interface MailService {

  void sendSimpleMessage(UserDTO input);
}
