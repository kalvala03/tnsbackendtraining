package com.kprit.strings;

public class StringDemo {
    public static void main(String[] args) {
        // Strings are immutable → once created, their content cannot be changed.
        // There are two ways to create a String in Java:

        // i) String Literal → stored in String Pool (special memory area in heap)
        String a = "Kalyani";          
        String b = "Kalyani"; // a and b point to the same object in String Pool

        // ii) Using 'new' → creates a new object in heap memory
        String a1 = new String("Hello");   
        String b1 = new String("Hello");   // a1 and b1 are different objects in heap
        String a2 = new String("Kalyani"); // different object in heap, even if content is same as 'a'

        // '==' operator checks reference equality (memory address)
        System.out.println(a == b);   // true → both refer to same object in String Pool
        System.out.println(a1 == b1); // false → different objects in heap

        // .equals() checks content equality
        System.out.println(a.equals(b));    // true → content is same
        System.out.println(a1.equals(b1));  // true → content is same
        System.out.println(a == a2);        // false → different objects (literal vs heap)
        System.out.println(a.equals(a2));   // true → content is same

        // String immutability demonstration
        String s1 = "Java";
        String s2 = "Java"; // both refer to same object in String Pool

        System.out.println("Before change:");
        System.out.println("s1 = " + s1);
        System.out.println("Address (s1): " + System.identityHashCode(s1));
        System.out.println("s2 = " + s2);
        System.out.println("Address (s2): " + System.identityHashCode(s2));
        System.out.println("Are s1 and s2 same object? " + (s1 == s2));

        // Modifying s1 using concat() → creates a NEW String object (immutability)
        s1 = s1.concat(" Learner");

        System.out.println("After change:");
        System.out.println("s1 = " + s1);
        System.out.println("Address (s1): " + System.identityHashCode(s1)); // new object → different hashcode
        System.out.println("s2 = " + s2);
        System.out.println("Address (s2): " + System.identityHashCode(s2)); // unchanged
        System.out.println("Are s1 and s2 same object? " + (s1 == s2));     // false
    }
}
