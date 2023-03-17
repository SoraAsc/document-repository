package com.project.documentrepository.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	// Routes - Geral
	@GetMapping("/")
	public String showIndex() {
		return "login";
	}
	
	// Routes - Administrator
	@GetMapping("/administrator")
	public String showAdministratorDashboard() {
		return "administrator/dashboard";
	}
	
	@GetMapping("/administrator/users")
	public String showUsers() {
		return "administrator/users";
	}
	
	@GetMapping("/administrator/repositories")
	public String showRepositories() {
		return "administrator/repositories";
	}

//	// Routes - User
//	@GetMapping("/user")
//	public String showUserDashboard() {
//		return "user/dashboard";
//	}
}