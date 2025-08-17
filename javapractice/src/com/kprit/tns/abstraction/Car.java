package com.kprit.tns.abstraction;

// Abstraction is the process of hiding implementation details and showing only essential features.
//In this code, 'Car' defines abstract methods (accelerate, brake) but hides how they work,
//and each subclass (Tesla, Maruti) provides its own implementation.

public abstract class Car {
	abstract void accelerate();
    abstract void brake();
    
    void startCar() {
        System.out.println("Car started.");
    }
}
    
class Tesla extends Car {
	@Override
     void accelerate() {
         System.out.println("Tesla accelerates using electric motor.");
     }

     @Override
     void brake() {
         System.out.println("Tesla uses regenerative braking.");
     }
}

class Maruti extends Car {
     @Override
     void accelerate() {
         System.out.println("Maruti accelerates using petrol engine.");
     }

     @Override
     void brake() {
         System.out.println("Maruti uses hydraulic brakes.");
         }
 }
