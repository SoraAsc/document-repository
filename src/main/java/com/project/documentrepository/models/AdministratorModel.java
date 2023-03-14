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
@Table(name = "Administrator")
public class AdministratorModel extends PersonModel {
	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	// Method - Getters and Setters
	@CreatedDate
	private Date createdDate;

	@LastModifiedDate
	private Date lastModifiedDate;

	public int getId() {
		return id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
}
