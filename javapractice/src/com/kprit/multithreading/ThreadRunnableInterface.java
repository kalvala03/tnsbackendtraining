package com.kprit.multithreading;

// Demo for creating thread by implementing Runnable interface
// showing: Multiple threads sharing the same Runnable object
public class ThreadRunnableInterface {

    // Task class implementing Runnable
    static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Task executed by: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        // Create only one Runnable object
        MyTask obj = new MyTask();

        // Create multiple Thread objects using the same Runnable object
        Thread t1 = new Thread(obj, "T1");  
        Thread t2 = new Thread(obj, "T2");
        Thread t3 = new Thread(obj, "T3");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
