package com.spring.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Contact implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private List<ContactTelDetails> contactTelDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long l) {
		this.id = l;
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

	public List<ContactTelDetails> getContactTelDetails() {
		return contactTelDetails;
	}

	public void setContactTelDetails(List<ContactTelDetails> contactTelDetails) {
		this.contactTelDetails = contactTelDetails;
	}

	public String toString() {
		return "Contact - Id: " + id + ", First name: " + firstName + ", Last name: " + lastName + ", Birthday: "
				+ dateOfBirth;
	}
}
