package com.example.demo.controller;

import com.example.demo.models.UserModel;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LoginController {

    @PostMapping("/api/login")
    public String LoginUser(@RequestBody UserModel user)
    {
        long actualTime = System.currentTimeMillis();
        return Jwts.builder()
                .setSubject(user.getUser())
                .claim("roles", "user")
                .setIssuedAt(new Date(actualTime))
                .setExpiration(new Date(actualTime + 10000))
                .signWith(SignatureAlgorithm.HS512, "secretkey").compact();
    }
}
