package com.example.hexagonal.application.port.in;

import com.example.hexagonal.application.domain.User;

import java.util.List;

public interface UserUseCase {
    User saveUser(User user);
    List<User> getAllUsers();
}
