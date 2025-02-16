package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserDao;
import com.springboot.model.MyUser;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;
	
	
	public void saveAllUser(MyUser user) {
		System.out.println("Service......");
		userdao.saveUser(user);
	}


	
	
}
