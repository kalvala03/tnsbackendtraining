package com.kprit.multithreading;

public class AnonymousClassDemo {

    // Runnable object created using anonymous class
    Runnable r1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Task executed by: " + Thread.currentThread().getName());
        }
    };

    public static void main(String[] args) {
        // Create outer class object to access non-static Runnable
        AnonymousClassDemo obj = new AnonymousClassDemo();

        // Creating a thread using the anonymous Runnable object
        Thread t1 = new Thread(obj.r1);

        // Start the thread
        t1.start();
    }
}
