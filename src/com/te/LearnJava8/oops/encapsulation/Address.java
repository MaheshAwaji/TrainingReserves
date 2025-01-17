package com.te.LearnJava8.oops.encapsulation;

public class Address {
	private String city;
	private String country;
	private long pincode;

	public Address() {
		super();
	}

	public Address(String city, String country, long pincode) {
		super();
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}

}
