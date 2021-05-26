package com.metapack.estimatedpackagedeliverytime.controllers;

import com.metapack.estimatedpackagedeliverytime.dao.entity.User;
import com.metapack.estimatedpackagedeliverytime.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity authorizeUser(@RequestBody User user)
    {
        if(userService.findByUsername(user))
        {
            return ResponseEntity.status(HttpStatus.OK).body("Użytkownik istnieje, zalogowano poprawnie");
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Błędny login lub hasło");
        }
    }
}
