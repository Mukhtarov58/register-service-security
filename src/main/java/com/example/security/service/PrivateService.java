package com.example.security.service;

import org.springframework.stereotype.Service;

@Service
public class PrivateService {
    public String getText() {
        return "This is private data!";
    }
}
