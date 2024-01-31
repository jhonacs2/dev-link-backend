package com.link.linksecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class UserController {

    @GetMapping("/v1/user")
    public String userController() {
        return "User Controller is working";
    }
}
