package com.example.security.service;

import org.springframework.stereotype.Service;

@Service
public class PublicService {
    public String getText() {
        return "This is public data!";
    }
}
