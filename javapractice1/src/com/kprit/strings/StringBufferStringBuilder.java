package com.kprit.strings;

// Both StringBuffer and StringBuilder are mutable, meaning their contents can be changed without creating a new object.

public class StringBufferStringBuilder {

    public static void main(String[] args) {
        // Creating two separate StringBuffer objects with the same initial content "Java"
        StringBuffer s1 = new StringBuffer("Java");
        StringBuffer s2 = new StringBuffer("Java"); // s1 and s2 refer to different objects in memory

        // Printing initial values and memory addresses
        System.out.println("Before change:");
        System.out.println("s1 = " + s1);
        System.out.println("Address (s1): " + System.identityHashCode(s1)); // prints memory address of s1
        System.out.println("s2 = " + s2);
        System.out.println("Address (s2): " + System.identityHashCode(s2)); // prints memory address of s2
        System.out.println("Are s1 and s2 same object? " + (s1 == s2)); // false, because they are different objects

        // Modifying s1 using append() method
        // Important: StringBuffer is mutable, so append() changes the existing object rather than creating a new one
        s1 = s1.append(" Learner"); // here s1 still refers to the same object, just modified

        // Printing values and memory addresses after modification
        System.out.println("After change:");
        System.out.println("s1 = " + s1);
        System.out.println("Address (s1): " + System.identityHashCode(s1)); // same as before,i.e showing object didn't change
        System.out.println("s2 = " + s2);
        System.out.println("Address (s2): " + System.identityHashCode(s2)); // unchanged
        System.out.println("Are s1 and s2 same object? " + (s1 == s2)); // still false
    }
}
