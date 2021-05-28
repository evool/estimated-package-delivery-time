package com.metapack.estimatedpackagedeliverytime.controllers;

import com.metapack.estimatedpackagedeliverytime.dao.entity.Module;
import com.metapack.estimatedpackagedeliverytime.services.ModuleService;
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
