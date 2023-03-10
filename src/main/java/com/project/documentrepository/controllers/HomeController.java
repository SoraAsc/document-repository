package com.project.documentrepository.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "login";
	}
	
	@GetMapping("/dashboard")
	public String userDashboard() {
		return "administrator/dashboard";
	}
	
//	@GetMapping("/dashboard")
//	public String administratorDashboard() {
//		return "administrator/dashboard";
//	}
}