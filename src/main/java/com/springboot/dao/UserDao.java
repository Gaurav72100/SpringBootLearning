package com.springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.model.MyUser;

@Repository
public class UserDao {

	@Autowired
	private UserRepo repo;

	public void saveUser(MyUser user) {
		
		System.out.println("Repository");
		repo.save(user);
		
	}

}
