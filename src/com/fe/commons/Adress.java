package com.fe.commons;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Adress {
	
	
	@Column(name="COUNTRY_NAME")
	private String country;
	@Column(name="STATE_NAME")
	private String state;
	@Column(name="DIST_NAME")
	private String dist;
	@Column(name="CITY_NAME")
	private String city;
	@Column(name="PIN_NO")
	private String pin;
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	

}
