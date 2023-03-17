package com.project.documentrepository.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="telephone")
public class Telephone extends BD {
	private static final long serialVersionUID = 1L;
	// Fields
	@Column(name = "dd", length=2, nullable=false)
	private String dd;
	
	@Column(name = "ddd", length=3, nullable=false)
	private String ddd;
	
	@Column(name = "number", length=9, nullable=false)
	private String number;
	
	@ManyToOne
	@JoinColumn(name = "administrator_id")
	private Administrator administrator;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User User;
	
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

	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}
}