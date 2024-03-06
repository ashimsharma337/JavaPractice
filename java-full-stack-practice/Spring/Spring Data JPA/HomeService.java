package com.example.homebuyer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.homebuyer.beans.Home;
import com.example.homebuyer.data.HomeRepository;

// business logic
@Service
public class HomeService {
	
	@Autowired
	private HomeRepository repository;
     
	public HomeService() {
		System.out.println("Service created!");
	}
	
	public Home save(Home home) {
		return repository.save(home);
	}
	
	public List<Home> findAll(){
		return repository.findAll();
	}
}
