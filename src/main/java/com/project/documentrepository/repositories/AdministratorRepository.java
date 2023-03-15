package com.project.documentrepository.repositories;

import org.springframework.data.repository.CrudRepository;
import com.project.documentrepository.models.AdministratorModel;

public interface AdministratorRepository extends CrudRepository<AdministratorModel, Integer> {
	
}
