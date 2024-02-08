package com.restAPI.employeeManagement.dto.Response;

import java.io.Serializable;
import java.util.Date;

public class EmployeeResponse implements Serializable{
    private Long id;
    private String name;
    private String gender;
    private Date dob;
    private String address;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Date getDateOfBirth() {
		return dob;
	}

	public void setDateOfBirth(Date dobh) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EmployeeResponse() {
		super();
	}

}
