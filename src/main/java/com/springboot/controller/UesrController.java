package com.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.MyUser;
import com.springboot.service.UserService;

import jakarta.validation.Valid;

@RestController
public class UesrController {

	@Autowired
	private UserService userservice;
	
	@PostMapping
	public ResponseEntity saveAllUser(@Valid @RequestBody MyUser user, BindingResult result ) {
		if(result.hasErrors()) {
			Map<String,String> validation = new HashMap<>();
			List<FieldError> fielderror= result.getFieldErrors();
			for(FieldError f:fielderror) {
				validation.put(f.getField(),f.getDefaultMessage());
			}
			 return ResponseEntity.badRequest().body(validation);
		}
		System.out.println("Controller.....");
		userservice.saveAllUser(user);
		
		return ResponseEntity.ok("Successfull");
				
	}
}
