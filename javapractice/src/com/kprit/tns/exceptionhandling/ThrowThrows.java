package com.kprit.tns.exceptionhandling;
import java.util.Scanner;

public class ThrowThrows {
	//We can throw our own exception using the throw keyword.
	//After throwing, we have two choices: 
	//either declare it in the method signature using throws, or handle it directly using a try-catch block
	
    // Method 1: Declares exception with 'throws'
    public static void checkAgeWithThrows(int age) throws Exception {
        if (age < 18) {
            // throw exception explicitly
            throw new Exception("You must be 18 or older to vote.");
        } else {
            System.out.println("You can vote! (From throws method)");
        }
    }

    // Method 2: Handles exception with try-catch
    public static void checkAgeWithTryCatch(int age) {
        try {
            if (age < 18) {
                // throw exception explicitly
                throw new Exception("You must be 18 or older to vote.");
            }
            System.out.println("You can vote! (From try-catch method)");
        } catch (Exception e) {
            // Handling the exception here
            System.out.println("Exception caught from try-catch: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        // 1. Calling method that uses 'throws'
        //In this case, exception was declared with throws, but caller had to catch it.
        try {
            checkAgeWithThrows(age);
        } catch (Exception e) {
            System.out.println("Exception caught from throws method: " + e.getMessage());
        }

        // 2. Calling method that uses try-catch
        //In this case, exception was handled inside the method.
        checkAgeWithTryCatch(age);

        sc.close();
        
    }
}
