package com.example.hexagonal.framework.adapter.in;

import com.example.hexagonal.application.domain.User;
import com.example.hexagonal.application.port.in.UserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserRest {

    @Autowired
    UserUseCase userUseCase;

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User newUser = userUseCase.saveUser(user);
        return ResponseEntity.status(201).body(newUser);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAlllUsers() {
        List<User> users = userUseCase.getAllUsers();
        return ResponseEntity.ok(users);
    }
}
