package com.kprit.tns.abstractclass;

//Demo to understand about Abstract classes
//Abstract class provides partial abstraction bcz it can have both abstract(without body) and non-abstract methods.
//We cannot create an object of the abstract class itself
//We must create a subclass  that provides implementations for the abstract methods, 
//and then We can create an object of that subclass.
//Abstract class is used when classes share a common base with some default implementation.


public abstract class Vehicle {        //class declared with the abstract keyword
	String brand;
	
	//Constuctor
	Vehicle(String brand){
		this.brand=brand;
	}
	
	//Abstract method 
	abstract void fuelType();    
	
	// Normal/concrete method
	void start() {
		System.out.println(brand + " is started");
	}
	
	//Final method (cannot be overridden)
	final void stop() {
		System.out.println(brand + " is stopped");
	}
	
	//static method
	static void info() {
		System.out.println("All vehicles help in transportation.");
	}
	
	
}
