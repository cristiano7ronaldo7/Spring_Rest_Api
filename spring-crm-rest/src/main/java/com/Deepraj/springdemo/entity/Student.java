package com.Deepraj.springdemo.entity;

public class Student {
	
	public String firstName;
	public String lastname;
	
	public Student()
	{
		
	}

	public Student(String firstName, String lastname) {
		this.firstName = firstName;
		this.lastname = lastname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
