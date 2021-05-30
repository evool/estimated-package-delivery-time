package com.metapack.estimatedpackagedeliverytime.repositories;

import com.metapack.estimatedpackagedeliverytime.dao.entity.Module;
import org.springframework.data.repository.CrudRepository;

public interface ModuleRepository extends CrudRepository<Module, Long> {
    Module findByCode(String code);
}
