package com.example.springbootsecurity.service.impl;

import com.example.springbootsecurity.model.entity.User;
import com.example.springbootsecurity.repository.UserRepository;
import com.example.springbootsecurity.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }
}
