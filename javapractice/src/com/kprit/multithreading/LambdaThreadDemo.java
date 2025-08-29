package com.kprit.multithreading;

public class LambdaThreadDemo {

	 public static void main(String[] args) {
	        // Runnable using Lambda
	        Runnable r1= () -> {
	            for (int i = 1; i <= 5; i++) {
	                System.out.println(Thread.currentThread().getName() + " -> " + i);
	            }
	        };

	        // Create threads with the same task
	        Thread t1 = new Thread(r1, "Lambda-1");
	        Thread t2 = new Thread(r1, "Lambda-2");

	        // Start threads
	        t1.start();
	        t2.start();
	    }
}
