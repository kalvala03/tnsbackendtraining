package com.kprit.tns.exceptionhandling;
import java.util.Scanner;
import java.io.*;

public class ThrowThrows {
	//Throw:We can throw our own exception using the throw keyword.
	
	 //  For unchecked exceptions, we don’t need to declare them using throws in the method signature.
    public static void checkAgeWithThrows(int age) {
        if (age < 18) {
            // throw exception explicitly
            throw new ArithmeticException("You must be 18+ to vote.");
        } else {
            System.out.println("You can vote! (From throws method)");
        }
    }
    
	
	//Checked exceptions must be either:
	//i)Declared in the method signature using throws, OR
	//ii)Handled using try-catch.
	
	// Method 1: Declaring checked exception using 'throws'
    public static void readFileWithThrows() throws IOException {
        FileReader fr = new FileReader("test.txt"); // may throw IOException
        System.out.println("File opened successfully! (From throws method)");
    }

    // Method 2: Handling checked exception with try-catch
    public static void readFileWithTryCatch() {
        try {
            FileReader fr = new FileReader("test.txt"); // may throw IOException
            System.out.println("File opened successfully! (From try-catch method)");
        } catch (IOException e) {
            System.out.println("Caught Checked Exception (try-catch): " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        //Calling method that declares exception with 'throws'
        try {
            readFileWithThrows();
        } catch (IOException e) {
            System.out.println("Caught Checked Exception (throws method): " + e.getMessage());
        }

        // Calling method that handles exception with try-catch
        readFileWithTryCatch();
    }
}