package com.project.documentrepository.models;

import java.io.Serializable;
import java.sql.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BDModel implements Serializable {
	private static final long serialVersionUID = 1L;
	// Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@CreatedDate
	private Date createdDate;
	
	@LastModifiedDate
	private Date lastModifiedDate;

	// Method - Getters and Setters
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