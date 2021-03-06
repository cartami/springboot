package com.example.Week2_HW1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Nissan {

	private String color;

	// DI via field(property)
	@Autowired
	private Engine eng;
	@Autowired
	private Vehicle vehicle;

	@Autowired
	public Nissan(Engine eng, Vehicle vehicle) {
		this.eng = eng;
		this.vehicle = vehicle;
		eng.Specs();
		vehicle.Specs();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Engine getEng() {
		return eng;
	}

	@Autowired
	public void setEng(Engine eng) {
		this.eng = eng;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	@Autowired
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String Specs() {
		return "Nissan [getColor()=" + getColor() + ", getEng()=" + getEng() + ", getVehicle()=" + getVehicle() + "]";
	}
	
	

}
