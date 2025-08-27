package com.kprit.tns.exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		// 1️)Multiple catch blocks for one try (Allowed)
        try {
            int[] arr = new int[3];
            arr[5] = 10; 
        }
        catch(ArithmeticException e) { 
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println(e);
        }
        catch(Exception e) { 
            System.out.println("General Exception caught");
        }

        // 2️)Multiple separate try-catch blocks (Allowed)
        try {
            int x = 10/0; 
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }

        try {
            String s = null;
            System.out.println(s.length()); 
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }

        // 3️) Nested try blocks (Allowed)
        try {
            try {
                int a = 10/0; 
            }
            catch(ArithmeticException e) {
                System.out.println("Inner catch block handled ArithmeticException");
            }

            int[] arr2 = new int[2];
            arr2[4] = 100; 
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch block handled ArrayIndexOutOfBoundsException");
        }

        // 4️) Multiple try blocks without catch/finally (Not Allowed)
        /*
        try {
            int num = 5/0;
        }
        try {
            int num2 = 10/0; //  ERROR: multiple try without catch/finally
        }
        */

        System.out.println("Program execution completed!");
	}

}
