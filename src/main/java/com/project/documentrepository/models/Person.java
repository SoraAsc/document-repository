package com.project.documentrepository.models;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@MappedSuperclass
public class Person extends BD implements Serializable {
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
	@JoinTable(inverseJoinColumns=@JoinColumn(name = "telephone_id"))
	private List<Telephone> telephone;
	
	@OneToOne
	@JoinColumn(name = "id_address")
	private Address address;
	
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

	public List<Telephone> getTelephone() {
		return telephone;
	}

	public void setTelephone(List<Telephone> telephone) {
		this.telephone = telephone;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}