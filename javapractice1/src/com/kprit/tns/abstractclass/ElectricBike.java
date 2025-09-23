package com.kprit.tns.abstractclass;

public class ElectricBike extends Vehicle {
	
	 ElectricBike(String brand){
		super(brand);
	}
	 
	void fuelType() {
		System.out.println(brand + " uses Electricity.");
	}

}
