package com.metapack.estimatedpackagedeliverytime.controller;

import com.metapack.estimatedpackagedeliverytime.LoginCredentials;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/authorize")
    public void login(@RequestBody LoginCredentials credentials) {

    }
}
