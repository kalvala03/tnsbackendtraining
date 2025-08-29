package com.kprit.multithreading;

public class ImpOfRunnable {

    // Parent class (some base functionality)
    class Vehicle {
        public void drive() {
            System.out.println("Vehicle is moving...");
        }
    }

    // Car extends Vehicle And implements Runnable
    // This shows Runnable allows multiple inheritance style (since Thread cannot be extended along with Vehicle)
    class Car extends Vehicle implements Runnable {
        @Override
        public void run() {
            System.out.println("Car running by: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        ImpOfRunnable outer = new ImpOfRunnable(); 

        // Create only One Runnable object 
        Car obj = outer.new Car();

        // Call method from parent class (inherited from Vehicle)
        obj.drive();

        // Create multiple threads using the Same Runnable (myCar)
        Thread t1 = new Thread(obj, "Driver-1");
        Thread t2 = new Thread(obj, "Driver-2");
        Thread t3 = new Thread(obj, "Driver-3");

        // Start threads (each will execute run())
        t1.start();
        t2.start();
        t3.start();
    }
}
