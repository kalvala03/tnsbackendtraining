package com.kprit.interthreadcommunication;

// wait() – Pauses the current thread until another thread notifies it. 
// notify() – Wakes up one waiting thread after a condition changes.

public class WaitNotifyMethod {

    public synchronized void waitNotifyDemo() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait(); // thread waits until another thread calls notify()
            System.out.println(Thread.currentThread().getName() + " resumed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void doNotify() {
        System.out.println(Thread.currentThread().getName() + " calls notify()");
        notify(); // wakes up only ONE waiting thread
    }

    public static void main(String[] args) throws InterruptedException {
        WaitNotifyMethod obj = new WaitNotifyMethod();

        // Thread-1
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                obj.waitNotifyDemo();
            }
        }, "T1");

        // Thread-2
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                obj.waitNotifyDemo();
            }
        }, "T2");

        t1.start();
        t2.start();

        // Give time so both threads start waiting
        Thread.sleep(2000);

        // Notifier thread
        Thread notifier = new Thread(new Runnable() {
            public void run() {
                obj.doNotify();
            }
        }, "Notifier");

        notifier.start();
    }
}
