package com.example.security.controller;

import com.example.security.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final HomeService homeService;
    private final UsersService userService;
    private final AdminService adminService;
    private final PrivateService privateService;
    private final PublicService publicService;

    public HomeController(HomeService homeService, UsersService userService, AdminService adminService, PrivateService privateService, PublicService publicService) {
        this.homeService = homeService;
        this.userService = userService;
        this.adminService = adminService;
        this.privateService = privateService;
        this.publicService = publicService;

    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("text", homeService.getText());
        return "index";
    }

    @GetMapping("/index")
    public String index() {
        return "redirect:/";
    }

    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("text", userService.getText());
        return "user";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("text", adminService.getText());
        return "admin";
    }
    @GetMapping("/private-data")
    public String privateData(Model model) {
        model.addAttribute("text", privateService.getText());
        return "private-data";
    }

    @GetMapping("/public-data")
    public String publicData(Model model) {
        model.addAttribute("text", publicService.getText());
        return "public-data";
    }
}