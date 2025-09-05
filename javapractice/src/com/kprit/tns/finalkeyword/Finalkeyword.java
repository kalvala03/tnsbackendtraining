package com.kprit.tns.finalkeyword;

public class Finalkeyword {
	
    // i)Class demonstrating final variables
    class Demo {
        final int n;                        // blank final (must be initialized)
        static final String NAME = "Ram";   // static final (constant)

        public Demo() {
            n = 10;  // initialization in constructor
        }
    }

    // ii) final class → cannot be inherited
    final class FinalClass {
        void showMessage() {
            System.out.println("This is a final class. It cannot be inherited.");
        }
    }

    // Parent class for method demonstration
    class Parent {
        // iii) final method → cannot be overridden
        public final void display() {
            System.out.println("This is a final method. Cannot be overridden.");
        }
        
        public void normalMethod() {
            System.out.println("This is a normal method. It can be overridden.");
        }
    }

    // Child class inheriting from Parent
    class Child extends Parent {
        @Override
        public void normalMethod() {
            System.out.println("Normal method overridden in Child class.");
        }
    }

    // iv) final parameter → cannot be modified inside method
    void showValue(final int num) {
        System.out.println("Final parameter value: " + num);
        // num = num + 10; // Compilation error
    }

    public static void main(String[] args) {
        Finalkeyword obj = new Finalkeyword();

        //Final Variables direct initialization
        final int num = 5;   
        
        final int CAPACITY;   // blank final variable
        CAPACITY = 10;        //can be assigned once

        // Final with Mutable Objects 
        final StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before: " + sb);
        sb.append(" World"); // allowed (content changes)
        System.out.println("After: " + sb);
        //sb.new StringBuilder("Hi");  -->error: cannot assign a value to final variable sb
        
        //final reference variables cannot reassign to a new object.
        //But as it is mutable object its content can still change.
        

        // Final with Immutable Objects
        final String str = "Java";
        System.out.println("Before: " + str);
        String newStr = str.concat(" Rocks");
        System.out.println("After concat: " + newStr);
        System.out.println("After: " + str);
    }
}
