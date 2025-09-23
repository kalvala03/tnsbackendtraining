package com.kprit.multithreading;

// Demo program for creating threads by extending the Thread class
public class ThreadClass {
	
	// First thread class extending Thread
	class Demo1 extends Thread {
		// Constructor to set custom thread name
		public Demo1(String tname) {
			super(tname); // pass thread name to parent constructor
		}

		@Override
		public void run() {
			// Task executed by this thread
			System.out.println("Task executed by: " + Thread.currentThread().getName());
		}
	}

	// Second thread class extending Thread
	class Demo2 extends Thread {
		// Constructor to set custom thread name
		public Demo2(String tname) {
			super(tname);
		}

		@Override
		public void run() {
			// Task executed by this thread
			System.out.println("Task executed by: "+ Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		// Create outer class object (to access inner classes)
		ThreadClass ob = new ThreadClass();

		// Create objects of thread classes with custom names
		Demo1 obj = ob.new Demo1("T1");  // Thread with name "T1"
		Demo2 obj2 = ob.new Demo2("T2"); // Thread with name "T2"

		// Start both threads (calls run() internally)
		obj.start();
		obj2.start();

		// Print the number of active threads (including main thread)
		System.out.println(Thread.activeCount());
	}
}
