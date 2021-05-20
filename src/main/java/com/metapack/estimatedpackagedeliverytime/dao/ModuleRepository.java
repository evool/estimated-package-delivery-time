package com.metapack.estimatedpackagedeliverytime.dao;

import com.metapack.estimatedpackagedeliverytime.dao.entity.Module;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModuleRepository extends CrudRepository<Module, Long> {
}
