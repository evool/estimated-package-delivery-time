package com.metapack.estimatedpackagedeliverytime.controllers;

import com.metapack.estimatedpackagedeliverytime.dao.entity.User;
import com.metapack.estimatedpackagedeliverytime.services.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService service)
    {
        userService = service;
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user)
    {
        return userService.save(user);
    }

    @GetMapping("/authorize")
    public void authorizeUser(@RequestBody User user)
    {

    }
}
