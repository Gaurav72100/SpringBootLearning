package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.MyUser;
import com.springboot.service.UserService;

@RestController
public class UesrController {

	@Autowired
	private UserService userservice;
	
	@PostMapping
	public MyUser getAllUser(@RequestBody MyUser user ) {
		System.out.println("Controller.....");
		userservice.saveAllUser(user);
		
		return user;
				
	}
}
