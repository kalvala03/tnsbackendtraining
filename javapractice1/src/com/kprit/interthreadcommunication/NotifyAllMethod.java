package com.kprit.interthreadcommunication;

// notifyAll() – Wakes up all waiting threads, so they can recheck the condition.
public class NotifyAllMethod {

    public synchronized void waitNotifyDemo() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting...");
            wait(); // thread waits until another thread calls notifyAll()
            System.out.println(Thread.currentThread().getName() + " resumed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void doNotifyAll() {
        System.out.println(Thread.currentThread().getName() + " calls notifyAll()");
        notifyAll(); // wakes up ALL waiting threads
    }

    public static void main(String[] args) throws InterruptedException {
        NotifyAllMethod obj = new NotifyAllMethod();

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
                obj.doNotifyAll();
            }
        }, "Notifier");

        notifier.start();
    }
}
