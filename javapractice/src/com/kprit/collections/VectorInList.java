package com.kprit.collections;

import java.util.Vector;

//Vector → same as ArrayList but synchronized (thread-safe), slightly slower.
//Use when multiple threads need to access the same list safely.

public class VectorInList {

    public static void main(String[] args) {
         
        // Without generics (raw Vector): can add heterogeneous data
       
        Vector v = new Vector();   // raw type
        v.add(10);           // Integer
        v.add("Kalyani");    // String
        v.add(10.5);         // Double
        v.add(true);         // Boolean
        v.add('A');          // Character

        System.out.println(v);
        
        //With generics: Ensures type safety —only one data type allowed, compile-time error if you add something else.
        
        Vector<Integer> v1 = new Vector<>();
        // Addition of elements
        v1.add(10);
        v1.add(20);
        v1.add(30);
        // v1.add("Kalyani");  Error: The method add(Integer) in the type Vector<Integer> is not applicable for the arguments (String)

        System.out.println("Initial Vector: " + v1);

        // Size & Capacity
        System.out.println("Size: " + v1.size());
        System.out.println("Capacity: " + v1.capacity());

        // Adding another Vector
        Vector<Integer> v2 = new Vector<>();
        v2.add(40);
        v2.add(50);
        v2.add(60);
        
        /*
        for(int i=0;i<v2.size();i++) {
			v1.add(v2.get(i));
		}
		*/

        v1.addAll(v2);
        //v1.addAll(0,v2);
        System.out.println("After addAll: " + v1);

        // Retrieval
        System.out.println("Element at index 2: " + v1.get(2));
        System.out.println("First element: " + v1.firstElement());
        System.out.println("Last element: " + v1.lastElement());

        // Verification
        System.out.println(v1.contains(10));
        System.out.println(v1.containsAll(v2));
        System.out.println(v1.isEmpty());

        // Index based search
        System.out.println(v1.indexOf(50));
        System.out.println(v1.lastIndexOf(40));

        // Updation
        System.out.println(v1.set(0, 70));
        System.out.println("After update: " + v1);
        
        // Deletion
        v1.remove(4);
        System.out.println("After remove(index): " + v1);

        v1.remove(Integer.valueOf(30));
        System.out.println("After remove(Object): " + v1);

        v1.removeAll(v2);
        System.out.println("After removeAll(v2): " + v1);

        // Clear all
        v1.clear();
        System.out.println("After clear(): " + v1);
    }
}
