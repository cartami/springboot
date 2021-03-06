package com.example.Week2_HW1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Week2Hw1Application {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext Context= SpringApplication.run(Week2Hw1Application.class, args);
	     System.out.println("SpringBoot app running..");
		
	     
		   Nissan c1 =  Context.getBean(Nissan.class);
		   c1.Specs();
		   
		   Engine a1 = Context.getBean(Engine.class);
		   c1.setEng(a1);
		   c1.Specs();
		   
		   Vehicle v1 = Context.getBean(Vehicle.class);
		   c1.setVehicle(v1);
		   c1.Specs();
		   
	}

}
