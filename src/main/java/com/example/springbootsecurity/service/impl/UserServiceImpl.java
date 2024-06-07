package com.example.springbootsecurity.service.impl;

import com.example.springbootsecurity.model.dto.RegisterUserDto;
import com.example.springbootsecurity.model.entity.Role;
import com.example.springbootsecurity.model.entity.User;
import com.example.springbootsecurity.model.enums.RoleEnum;
import com.example.springbootsecurity.repository.RoleRepository;
import com.example.springbootsecurity.repository.UserRepository;
import com.example.springbootsecurity.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public List<User> allUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll().forEach(users::add);

        return users;
    }

    @Override
    public User createAdministrator(RegisterUserDto input) {
        Optional<Role> optionalRole = roleRepository.findByName(RoleEnum.ADMIN);

        if (optionalRole.isEmpty()) {
            return null;
        }

        var user = new User();
        user.setFullName(input.getFullName());
        user.setEmail(input.getEmail());
        user.setPassword(passwordEncoder.encode(input.getPassword()));
        user.setRole(optionalRole.get());

        return userRepository.save(user);
    }
}
