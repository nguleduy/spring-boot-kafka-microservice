package com.example.user.account.service.repository;

import com.example.user.account.service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
