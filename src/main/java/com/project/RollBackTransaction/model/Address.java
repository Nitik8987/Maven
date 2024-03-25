package com.project.RollBackTransaction.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {

	@Id
	private int addressid;
	
	private String area;
	
	private String city;

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", area=" + area + ", city=" + city + "]";
	}
	
	
}
