package com.kprit.tns.interfaces;

public class FunctionalInterfaceExample {

    //A functional interface is an interface with exactly one abstract method.
	
    @FunctionalInterface
    interface Calculator {
        int add(int a, int b); // single abstract method
    }

    // Inner class implementing Calculator
    class CalculatorImpl implements Calculator {
        public int add(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        FunctionalInterfaceExample obj = new FunctionalInterfaceExample();
        
        Calculator cobj = obj.new CalculatorImpl();
        
        int result = cobj.add(10, 20);
        System.out.println("Result: " + result);
    }
}
