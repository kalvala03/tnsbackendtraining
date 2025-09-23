package com.kprit.multithreading;

public class DefaultThread {

    public static void main(String[] args) {

    	//Default Thread
        System.out.println("Active Thread Count: " + Thread.activeCount()); 
        System.out.println("Default Thread Name: " + Thread.currentThread().getName()); 
        System.out.println("Default Thread Priority: " + Thread.currentThread().getPriority()); // default is 5

        // User-defined thread creation 
        Thread t1 = new Thread(); // creates a new thread (but no custom run() logic)
        System.out.println("State when Thread object is created but not started: "+t1.getState());
        
        t1.start(); // starts the new thread (does nothing since run() is empty)
        System.out.println("State when started and is ready to run: "+t1.getState());
        
        System.out.println("Active Thread Count: " + Thread.activeCount());
        System.out.println("State when Thread has finished execution: "+t1.getState());
        
        System.out.println("Active Thread Count: " + Thread.activeCount());
    }
}
