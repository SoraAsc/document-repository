package com.project.documentrepository.repositories;

import org.springframework.data.repository.CrudRepository;
import com.project.documentrepository.models.Administrator;

public interface AdministratorRepository extends CrudRepository<Administrator, Integer> {
	
}
