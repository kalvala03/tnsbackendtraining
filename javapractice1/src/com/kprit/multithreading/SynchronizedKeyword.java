package com.kprit.multithreading;

public class SynchronizedKeyword {

    // Synchronized method: Only one thread can execute this method at a time
    // This prevents race conditions when multiple threads access shared resources
    public synchronized void mul(int num) {
        for(int i = 1; i <= 5; i++) {
            int ans = num * i;
            System.out.println(ans);
        }
    }

    // Inner class extending Thread to create multiple threads
    class Demo extends Thread {
        int num; 

        Demo(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            // Call the synchronized method
            // Only one thread can execute mul() at a time
            mul(num);
        }
    }

    public static void main(String[] args) {
        SynchronizedKeyword ob = new SynchronizedKeyword();

        // Created two threads, each with a different number
        Demo obj1 = ob.new Demo(4);
        Demo obj2 = ob.new Demo(5);

        // Start both threads
        // Because mul() method is synchronized, one thread will finish completely
        // before the other thread can enter the method
        obj1.start();
        obj2.start();
    }
}
