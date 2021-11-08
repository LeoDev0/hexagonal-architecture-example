package com.example.hexagonal.application.service;

import com.example.hexagonal.application.domain.User;
import com.example.hexagonal.application.port.in.UserUseCase;
import com.example.hexagonal.application.port.out.UserPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserUseCase {

    @Autowired
    UserPortOut userPortOut;

    @Override
    public User saveUser(User user) {
        return userPortOut.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userPortOut.getAllUsers();
    }
}
