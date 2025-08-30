package com.kprit.thiskeyword;

//'this' in an abstract class,does not point to the abstract class itself (because abstract classes cannot 
//be instantiated). Instead, it points to the child class object which is actually created at runtime.

abstract class Vehicle {
	//instance variable
    String brand;
    
    //constructor
    Vehicle(String brand) {
        this.brand = brand;  // 'this' refers to the subclass object
    }
    
    //concrete method
    void register() {
        System.out.println("Registering vehicle of brand: " + this.brand);
    }

    //abstract method
    abstract void drive();
}

class Car extends Vehicle {
	Car(String brand) {
        super(brand);
    }

    @Override
    void drive() {
        System.out.println(this.brand + " car is driving...");
    }
}

public class InAbstractclass {
    public static void main(String[] args) {
        Vehicle c = new Car("Tesla");
        c.register();
        c.drive();
        System.out.println(c.brand);
    }
}

