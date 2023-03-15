package com.project.documentrepository.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@MappedSuperclass
public class PersonModel extends BDModel implements Serializable {
	private static final long serialVersionUID = 1L;
	// Fields
	@Column(name = "name", length = 128, nullable = false)
	private String name;
	
	@Column(name = "cpf", length = 14, unique=true)
	private String cpf;
	
	@Column(name = "email", length = 128, unique=true)
	private String email;
	
	@Column(name = "indentification", length = 128, nullable = false)
	private String indentification;
	
	@Column(name = "password", length = 128, nullable = false)
	private String password;
	
	@OneToMany
	private List<TelephoneModel> telephone;
	
	@OneToOne
	private TelephoneModel address;
	
	// Method - Getters And Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIndentification() {
		return indentification;
	}

	public void setIndentification(String indentification) {
		this.indentification = indentification;
	}

	public List<TelephoneModel> getTelephone() {
		return telephone;
	}

	public void setTelephone(List<TelephoneModel> telephone) {
		this.telephone = telephone;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}