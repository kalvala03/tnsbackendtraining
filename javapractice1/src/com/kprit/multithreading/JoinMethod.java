package com.kprit.multithreading;

//join() → pause current thread until another thread completes.
public class JoinMethod {
    public static void main(String[] args) {
    	Runnable r1=()->{
    		for(int i=1;i<=3;i++) {
    			System.out.println(Thread.currentThread().getName());
    		}
    	};
    	Runnable r2=()->{
    		for(int i=1;i<=3;i++) {
    			System.out.println(Thread.currentThread().getName());
    		}
    	};
    	
    	Thread t1=new Thread(r1);
    	Thread t2=new Thread(r2);
    	
    	t1.start();
    	t2.start();
    	
    	// Main thread waits for t1 and t2 to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	System.out.println("Main thread resumes after t1 and t2 finish");
    }
}
