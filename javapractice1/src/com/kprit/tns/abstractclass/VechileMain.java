package com.kprit.tns.abstractclass;

public class VechileMain {
	public static void main(String[]args) {
	
	//Vehicle obj=new Vehicle();   raises error,cannot create an object of the abstract class itself.
		
	Vehicle.info(); // Static method called via class name

    Vehicle obj2 = new ElectricBike("Ola");
    obj2.start();
    obj2.fuelType();
    obj2.stop();
    
	}
	
}
