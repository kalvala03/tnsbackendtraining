package com.kprit.multithreading;

//sleep() → pause current thread for some time.
public class SleepMethod {
	public static void main(String[] args) {
        System.out.println("Main thread starts");
        try {
            Thread.sleep(3000); // pause for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread ends after 2 seconds");
    }
}
