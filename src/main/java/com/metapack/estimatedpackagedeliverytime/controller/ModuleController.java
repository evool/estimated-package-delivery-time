package com.metapack.estimatedpackagedeliverytime.controller;

import com.metapack.estimatedpackagedeliverytime.entity.Module;
import com.metapack.estimatedpackagedeliverytime.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModuleController {

    private ModuleService service;

    @Autowired
    public ModuleController(ModuleService moduleService)
    {
        service = moduleService;
    }

    @PostMapping("/createModule")
    public Module createModule(@RequestBody Module module)
    {
        return service.save(module);
    }
}
