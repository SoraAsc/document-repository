package com.project.documentrepository.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Address")
public class AddressModel extends BDModel {
	private static final long serialVersionUID = 1L;
	// Fields
	
	
	
	@OneToOne
	private AdministratorModel administrator;
	
	@OneToOne
	private UserModel user;
	// Method - Getters And Setters
}
