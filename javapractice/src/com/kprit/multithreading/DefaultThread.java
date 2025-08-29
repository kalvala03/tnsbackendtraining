package com.kprit.multithreading;

public class DefaultThread {

    public static void main(String[] args) {
        // Default (main) thread details 
        System.out.println("This is Default Thread");
        System.out.println("Active Thread Count: " + Thread.activeCount()); // number of active threads
        System.out.println("Thread Name: " + Thread.currentThread().getName()); // usually "main"
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority()); // default is 5

        // User-defined thread creation 
        Thread t1 = new Thread(); // creates a new thread (but no custom run() logic)
        t1.start(); // starts the new thread (does nothing since run() is empty)

        // Check active thread count after starting new thread
        System.out.println("Active Thread Count after starting t1: " + Thread.activeCount());
    }
}
