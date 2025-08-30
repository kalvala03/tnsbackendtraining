package com.kprit.multithreading;

//  Lambda simplifies the syntax instead of writing an anonymous class.
//Only functional interfaces can use Lambda expressions.So only Runnable can use Lambda
//but Thread itself is a class, not a functional interface, so you cannot directly extend Thread using a Lambda.
public class LambdaThreadDemo {

    public static void main(String[] args) {
        
        // Creating a Runnable using a Lambda expression
        Runnable r1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        };

        Thread t1 = new Thread(r1, "Lambda-1");  
        Thread t2 = new Thread(r1, "Lambda-2");  
        
        t1.start();
        t2.start();
    }
}
