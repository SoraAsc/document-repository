package com.project.documentrepository.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address extends BD {
	private static final long serialVersionUID = 1L;
	// Fields
	@OneToOne
	@JoinColumn(name = "administrator_id")
	private Administrator administrator;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	// Method - Getters And Setters
}
