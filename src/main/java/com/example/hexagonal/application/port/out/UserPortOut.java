package com.example.hexagonal.application.port.out;

import com.example.hexagonal.application.domain.User;

import java.util.List;

public interface UserPortOut {
    User saveUser(User user);
    List<User> getAllUsers();
}
