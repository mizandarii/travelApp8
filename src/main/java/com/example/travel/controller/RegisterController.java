package com.example.travel.controller;

import com.example.travel.model.User; // Import the User class

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class RegisterController {

    @GetMapping("/register")
    public String showRegisterPage(Model model) {
        model.addAttribute("user", new User()); // Add an empty User object to the model
        return "redirect:/register";
    }
}
