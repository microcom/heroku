package com.auphelia.models;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Contact {

	private String firstName ;
	private String lastName ;
	private String street;
	private String city ;
	private String province ;
	private String postalCode ;
	
	public Contact(){}
	
	public Contact(String firstName, String lastName, String street,
			String city, String province, String postalCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	
}
