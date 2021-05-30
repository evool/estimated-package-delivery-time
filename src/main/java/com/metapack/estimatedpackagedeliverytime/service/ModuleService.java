package com.metapack.estimatedpackagedeliverytime.service;

import com.metapack.estimatedpackagedeliverytime.entity.Module;
import com.metapack.estimatedpackagedeliverytime.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {

    private ModuleRepository moduleRepository;

    @Autowired
    public ModuleService(ModuleRepository repository)
    {
        moduleRepository = repository;
    }

    public Module save(Module module)
    {
        // odpowiednia konwersja from i to na HH:mm:ss

        //LocalTime from = module.getDeliveryWindow().getFrom();
        //LocalTime to = module.getDeliveryWindow().getTo();

        return moduleRepository.save(module);
    }
}