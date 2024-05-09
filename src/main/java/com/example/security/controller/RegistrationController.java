package com.example.security.controller;
import com.example.security.service.RegisterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    private final RegisterService registerService;

    public RegistrationController(RegisterService registerService) {
        this.registerService = registerService;
    }
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password) {
        registerService.registerUser(username, password);
        return "redirect:/login";
    }
}

