package com.restAPI.employeeManagement.dto.Request;
import java.io.Serializable;
import java.util.Date;

public class EmployeeRequest implements Serializable{
	private String name;
    private String gender;
    private Date dob;
    private String Address;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
