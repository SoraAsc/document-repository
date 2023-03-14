package com.project.documentrepository.models;

import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Person")
public abstract class PersonModel {
	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	protected String name;
	
	@Column(name = "cpf")
	protected String cpf;
	
	@Column(name = "email")
	protected String email;
	
	@Column(name = "indentification")
	protected String indentification;
	
	@Column(name = "password")
	protected String password;
	
	@CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date lastModifiedDate;

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

	public int getId() {
		return id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
