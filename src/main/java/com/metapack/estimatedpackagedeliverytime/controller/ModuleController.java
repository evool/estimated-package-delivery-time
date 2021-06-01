package com.metapack.estimatedpackagedeliverytime.controller;

import com.metapack.estimatedpackagedeliverytime.persistence.entity.Module;
import com.metapack.estimatedpackagedeliverytime.persistence.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModuleController {

    @Autowired
    private ModuleService service;

    @GetMapping("/modules")
    List<Module> getAllModules() {
        return service.listAll();
    }

    @PostMapping("/modules")
    Module newModule(@RequestBody Module newModule) {
        return service.save(newModule);
    }

    @GetMapping("/modules/{id}")
    Module getModule(@PathVariable Long id) {
        return service.get(id);
    }

    @DeleteMapping("/modules/{id}")
    void deleteModule(Long id) {
        service.delete(id);
    }

//    @PostMapping()
//    public Module createModule(@RequestBody Module module) {
//        return service.save(module);
//    }
}
