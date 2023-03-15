package com.project.documentrepository.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Telephone")
public class TelephoneModel extends BDModel {
	private static final long serialVersionUID = 1L;
	// Fields
	@Column(name = "dd", length=2, nullable=false)
	private String dd;
	
	@Column(name = "ddd", length=3, nullable=false)
	private String ddd;
	
	@Column(name = "number", length=9, nullable=false)
	private String number;
	
	@ManyToOne
	private AdministratorModel administrator;
	
	@ManyToOne
	private AdministratorModel User;
	
	// Method - Getters And Setters
	public String getDd() {
		return dd;
	}

	public void setDd(String dd) {
		this.dd = dd;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public AdministratorModel getAdministrator() {
		return administrator;
	}

	public void setAdministrator(AdministratorModel administrator) {
		this.administrator = administrator;
	}

	public AdministratorModel getUser() {
		return User;
	}

	public void setUser(AdministratorModel user) {
		User = user;
	}
}