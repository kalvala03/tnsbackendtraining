package com.kprit.tns.abstractclass;

public class Car extends Vehicle{
	
	Car(String brand){
		super(brand);
	}
	void fuelType() {
		System.out.println(brand + " uses Petrol.");
	}
}
