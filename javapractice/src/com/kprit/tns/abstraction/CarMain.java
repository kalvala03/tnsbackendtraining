package com.kprit.tns.abstraction;

public class CarMain {
	public static void main(String[] args) {
        Tesla obj1= new Tesla();
        obj1.startCar();
        obj1.accelerate();
        obj1.brake();

        Car obj2 = new Maruti();
        obj2.startCar();
        obj2.accelerate();
        obj2.brake();
    }
}
