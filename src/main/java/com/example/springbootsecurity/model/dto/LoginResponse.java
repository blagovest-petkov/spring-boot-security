package com.example.springbootsecurity.model.dto;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;

    private long expiresIn;
}
