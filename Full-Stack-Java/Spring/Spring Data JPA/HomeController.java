package com.example.homebuyer.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.homebuyer.beans.Home;
import com.example.homebuyer.services.HomeService;

// Handle web request/controller needs an object of service
@RestController
public class HomeController {
     
	@Autowired 
	private HomeService service;
	
	public HomeController() {
		System.out.println("Controller created!");
	}
	
	@PostMapping("/homebuyer/homes")
	public ResponseEntity<Home>save(@RequestBody Home home) { // parsing with jackson
		System.out.println("Post called");
		return new ResponseEntity<>(service.save(home), HttpStatus.CREATED);
	}
	
	@GetMapping("/homebuyer/homes")
	public ResponseEntity<List<Home>> findAll() {
		System.out.println("Get called");
		return new ResponseEntity<List<Home>>(service.findAll(), HttpStatus.OK);
	}
}