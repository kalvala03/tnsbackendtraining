package com.kprit.multithreading;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        
        // 1. Creating a thread by extending Thread using anonymous class
        new Thread() {
            public void run() {
                System.out.println("Extending thread: "+Thread.currentThread().getName());
            }
        }.start();
        

        // 2. Creating a thread by implementing Runnable using anonymous class
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Implementing Runnable: "+Thread.currentThread().getName());
            }
        }).start();
    }
}
