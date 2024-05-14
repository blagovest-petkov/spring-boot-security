package com.example.springbootsecurity.service;

import com.example.springbootsecurity.model.dto.LoginUserDto;
import com.example.springbootsecurity.model.dto.RegisterUserDto;
import com.example.springbootsecurity.model.entity.User;

public interface AuthenticationService {

    User signup(RegisterUserDto input);

    User authenticate(LoginUserDto input);
}