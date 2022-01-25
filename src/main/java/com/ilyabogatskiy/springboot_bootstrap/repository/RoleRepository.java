package com.ilyabogatskiy.springboot_bootstrap.repository;

import com.ilyabogatskiy.springboot_bootstrap.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}