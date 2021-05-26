package com.metapack.estimatedpackagedeliverytime.controllers;

import com.metapack.estimatedpackagedeliverytime.dao.entity.User;
import com.metapack.estimatedpackagedeliverytime.services.UserService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api")
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
    public String authorizeUser(@RequestBody User user)
    {
        if(userService.findByUsername(user))
        {
            Long now = System.currentTimeMillis();
            return Jwts.builder()
                    .setSubject(user.getUsername())
                    .claim("username", "role")
                    .setIssuedAt(new Date(now))
                    .setExpiration(new Date(now + 10000)) // 4
                    .signWith(SignatureAlgorithm.HS512, "secretkey").compact();
        }
        else {
            return "Błędny login lub hasło";
        }
    }


}
