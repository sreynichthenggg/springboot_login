package com.example.loginregister.controller;


import ch.qos.logback.core.model.Model;
import com.example.loginregister.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String register(Model model){
        User user= new User();
        model.addText("user");
        return "register";
    }
    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user){
        System.out.println(user);

        return "home";
    }
}
