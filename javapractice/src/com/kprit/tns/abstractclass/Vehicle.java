package com.kprit.tns.abstractclass;

public abstract class Vehicle {        //class declared with the abstract keyword
	String brand;
	
	//Constuctor
	Vehicle(String brand){
		this.brand=brand;
	}
	
	//Abstract method (must be implemented differently by each vehicle)
	abstract void fuelType();    
	
	// Normal/concrete method
	void start() {
		System.out.println(brand + " is started");
	}
	
	//Final method (common, cannot be overridden)
	final void stop() {
		System.out.println(brand + " is stopped");
	}
	
	//static method
	static void info() {
		System.out.println("All vehicles help in transportation.");
	}
	
	
}
