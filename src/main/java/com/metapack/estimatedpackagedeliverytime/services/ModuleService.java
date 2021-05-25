package com.metapack.estimatedpackagedeliverytime.services;

import com.metapack.estimatedpackagedeliverytime.dao.entity.Module;
import com.metapack.estimatedpackagedeliverytime.repositories.ModuleRepository;
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
        return moduleRepository.save(module);
    }

    // TODO
}