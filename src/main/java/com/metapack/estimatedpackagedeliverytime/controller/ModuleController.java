package com.metapack.estimatedpackagedeliverytime.controller;

import com.metapack.estimatedpackagedeliverytime.persistence.entity.Module;
import com.metapack.estimatedpackagedeliverytime.persistence.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/modules")
public class ModuleController {

    @Autowired
    private ModuleService service;

    @GetMapping()
    List<Module> getAllModules() {
        return service.listAll();
    }

    @PostMapping()
    ResponseEntity newModule(@RequestBody Module newModule) {
        service.save(newModule);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    Module getModule(@PathVariable Long id) {
        return service.get(id);
    }

    @DeleteMapping("/{id}")
    void deleteModule(Long id) {
        service.delete(id);
    }
}
