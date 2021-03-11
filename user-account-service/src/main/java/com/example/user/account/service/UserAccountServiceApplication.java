package com.example.user.account.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class UserAccountServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(UserAccountServiceApplication.class, args);
  }

}
