package com.kprit.tns.tostring;

/*
The toString() method in Java is used to provide a string representation of an object.
By default, Object class provides toString(), which returns the class name + "@" + hashcode.
         
By overriding toString(), we can return more useful information about the object in a readable format.
 */

public class ToString {
    static class Student {
        String name;
        int age;

        // Constructor to initialize student details
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            // Returning object data in a meaningful string format
            return "Name: " + name + ", Age: " + age;
        }
    }

    public static void main(String[] args) {

    	//Printing the object directly calls toString() internally.
    	//Instead of memory reference (default), it prints user-friendly output.

        Student s = new Student("Kalyani", 22); 
        System.out.println(s); 
    }
}
