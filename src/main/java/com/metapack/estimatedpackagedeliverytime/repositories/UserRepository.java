package com.metapack.estimatedpackagedeliverytime.repositories;

import com.metapack.estimatedpackagedeliverytime.dao.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
