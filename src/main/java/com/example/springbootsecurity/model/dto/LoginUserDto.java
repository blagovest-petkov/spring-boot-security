package com.example.springbootsecurity.model.dto;

import lombok.Data;

@Data
public class LoginUserDto {
    private String email;

    private String password;
}
