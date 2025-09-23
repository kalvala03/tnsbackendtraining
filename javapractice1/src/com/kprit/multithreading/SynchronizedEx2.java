package com.kprit.multithreading;

public class SynchronizedEx2 {
    int Count = 0;

    public synchronized void totalCount() {
    	Count += 50;
    	
    	/*
        // synchronized block using 'this' as the lock
        synchronized (this) {
            Count += 50;
        }
        */
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedEx2 obj = new SynchronizedEx2();

        Runnable r1 = () -> {
            for (int i = 1; i <= 1500; i += 50) {
                obj.totalCount();
            }
        };
        Runnable r2 = () -> {
            for (int i = 1; i <= 3000; i += 50) {
                obj.totalCount();
            }
        };
        Runnable r3 = () -> {
            for (int i = 1; i <= 2500; i += 50) {
                obj.totalCount();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final Count = " + obj.Count);
    }
}
