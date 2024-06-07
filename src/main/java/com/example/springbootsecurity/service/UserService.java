package com.example.springbootsecurity.service;

import com.example.springbootsecurity.model.dto.RegisterUserDto;
import com.example.springbootsecurity.model.entity.User;

import java.util.List;

public interface UserService {

    List<User> allUsers();

    User createAdministrator(RegisterUserDto input);
}
