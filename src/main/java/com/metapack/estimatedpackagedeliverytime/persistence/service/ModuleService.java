package com.metapack.estimatedpackagedeliverytime.persistence.service;

import com.metapack.estimatedpackagedeliverytime.persistence.ModuleBadJsonException;
import com.metapack.estimatedpackagedeliverytime.persistence.ModuleNotFoundException;
import com.metapack.estimatedpackagedeliverytime.persistence.entity.Module;
import com.metapack.estimatedpackagedeliverytime.persistence.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ModuleService {

    @Autowired
    private ModuleRepository repository;

    public List<Module> listAll() {
        return repository.findAll();
    }

    public Module save(Module module) {
        try {
            return repository.save(module);
        } catch(Exception e) {
            throw new ModuleBadJsonException();
        }
    }

    public Module get(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ModuleNotFoundException(id));
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}