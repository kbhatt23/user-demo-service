package com.learning.userdemoservice.bean;

import java.util.Date;

public class User {

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(Integer id, String name, Date dateOfBirth) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	private Integer id;
	
	private String name;
	
	private Date dateOfBirth;
}
