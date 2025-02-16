package com.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.MyUser;

public interface UserRepo extends JpaRepository<MyUser,Integer> {

}
