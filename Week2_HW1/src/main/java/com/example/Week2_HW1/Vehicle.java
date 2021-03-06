package com.example.Week2_HW1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Vehicle {

	private int vid;
	private String Manufacturer;

	// DI via field(property)
	@Autowired
	private Engine eng;
	@Autowired
	public Vehicle(Engine eng) {
		this.eng = eng;
		eng.Specs();
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public String Specs() {
		return "Person [getVid()=" + getVid() + ", getManufacturer()=" + getManufacturer() + ", getEng()=" + getEng()
				+ "]";
	}

}
