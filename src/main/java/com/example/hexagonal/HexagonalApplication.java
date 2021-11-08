package com.example.hexagonal;

import com.example.hexagonal.application.domain.User;
import com.example.hexagonal.application.domain.enums.Gender;
import com.example.hexagonal.framework.adapter.out.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HexagonalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HexagonalApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserRepository repository) {
        return args -> {
//            User user = new User(
//                    "Leonardo",
//                    "leo.80@protonmail.com",
//                    Gender.MALE
//            );
//
//            repository.insert(user);

//            var user = repository.findUserByEmail("leo.80@protonmail.com");
//
//            System.out.println(user);
        };
    }

}
