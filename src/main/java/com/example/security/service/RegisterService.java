package com.example.security.service;

import com.example.security.model.User;
import com.example.security.userRepository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void registerUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(passwordEncoder.encode(password));
        userRepository.save(user);
    }
}