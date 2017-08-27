package com.spring.beans;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("contact")
public class Contact {
	private Long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "[Id:" + this.id + ", first name:" + this.firstName + ", last name:" + this.lastName + ", DOB:"
				+ this.dateOfBirth + "]";
	}
}
