package com.example.homebuyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.homebuyer.services.HomeService;

// Handle web request/controller needs an object of service
@Controller // @Component is more general 
public class HomeController {
     
	@Autowired // (dependency injection) instead of making object our self spring will make us with @Autowired
	private HomeService service;
	
	public HomeController() {
		System.out.println("Controller created!");
	}
}
