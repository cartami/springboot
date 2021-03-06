package com.example.Week2_HW1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Engine {
	
	private String liters;
	private int cylinders;
	public String getLiters() {
		return liters;
	}
	public void setLiters(String liters) {
		this.liters = liters;
	}
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	
	public String Specs() {
		return "Engine [getLiters()=" + getLiters() + ", getCylinders()=" + getCylinders() + "]";
	}
	
	
}
