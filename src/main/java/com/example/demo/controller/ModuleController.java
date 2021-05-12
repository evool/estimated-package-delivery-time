package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleController {

    @PostMapping("/api/modules")
    public Module CreateModule(@RequestBody Module module)
    {
        return null;
    }
}
