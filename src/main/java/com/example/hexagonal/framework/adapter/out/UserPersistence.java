package com.example.hexagonal.framework.adapter.out;

import com.example.hexagonal.application.domain.User;
import com.example.hexagonal.application.port.out.UserPortOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserPersistence implements UserPortOut {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
