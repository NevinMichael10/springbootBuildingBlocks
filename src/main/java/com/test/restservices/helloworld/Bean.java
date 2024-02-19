package com.test.restservices.helloworld;

public class Bean {
	private String firstname;
	private String lastname;
	private String position;
	private String department;
	
	public Bean(String firstname, String lastname, String position, String department) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.position = position;
		this.department= department;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Bean [firstname=" + firstname + ", lastname=" + lastname + ", position=" + position + ", department="
				+ department + "]";
	}
		
}