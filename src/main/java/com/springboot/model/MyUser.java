package com.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MyUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String address;
	private int street_no;
	
	public MyUser() {
		
	}
	public MyUser(Integer id, String name,String address, int street_no) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
		this.street_no=street_no;
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public int getStreet_no() {
		return street_no;
	}
	public void setStreet_no(int street_no) {
		this.street_no = street_no;
	}
	

}
