package com.auphelia.models;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Contact {

	private String firstName;
	private String lastName;
	private String address;
	private String postalCode;

	public String getFirstName() {
		return firstName;
	}

	public Contact(String firstName, String lastName, String address,
			String postalCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.postalCode = postalCode;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
