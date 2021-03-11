package com.example.email.service.service.impl;

import com.example.email.service.dto.UserDTO;
import com.example.email.service.entity.Mail;
import com.example.email.service.repository.MailRepository;
import com.example.email.service.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

  @Autowired
  public JavaMailSender emailSender;

  @Autowired
  public MailRepository mailRepository;

  @Override
  public void sendSimpleMessage(UserDTO input) {
    try {

      Mail newMail = new Mail();
      newMail.setTo(input.getUserName());
      newMail.setSubject("Registration Success");
      newMail.setText("Welcome, You have successfully registered!");

      SimpleMailMessage message = new SimpleMailMessage();
      message.setTo(newMail.getTo());
      message.setSubject(newMail.getSubject());
      message.setText(newMail.getText());

      mailRepository.save(newMail);
      emailSender.send(message);
    } catch (MailException exception) {
      exception.printStackTrace();
    }

  }

}
