package com.restAPI.employeeManagement.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employeedb")
public class employeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_ID")
private long id;
	@Column(name="name")
private String name;
	@Column(name="gender")
private String gender;
	@Column(name="DOB")
private String dob;
	@Column(name="address")
private String address;

public employeeEntity(long id, String name, String gender, String dob, String address) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.dob = dob;
	this.address = address;
}

public employeeEntity() {
	super();
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
}
