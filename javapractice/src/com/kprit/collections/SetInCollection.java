package com.kprit.collections;

import java.util.*;

public class SetInCollection {

    public static void main(String[] args) {
    	/*
	HashSet → unique elements, no duplicates, no order.
			Use when you only need uniqueness, order doesn’t matter.
	
	LinkedHashSet → unique elements, maintains insertion order.
			Use when you need uniqueness and predictable iteration order.
	
	TreeSet → unique elements, automatically sorted (ascending).
			Use when you need uniqueness and sorting. */

        Set<String> set1 = new HashSet<>();

        // Addition
        set1.add("Kalyani");
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("Java");   // duplicate ignored

        System.out.println("HashSet: " + set1);

        // Retrieval: (Set has no index, so we use iterator/for-each)
        System.out.println("Iterating elements:");
        for (String s : set1) {
            System.out.println(s);
        }

        // Verification
        System.out.println("Contains Java? " + set1.contains("Java"));
        System.out.println("Is Empty? " + set1.isEmpty());

        // Deletion
        set1.remove("Python");
        System.out.println("After remove(Python): " + set1);

        // Bulk Operations
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("HTML");
        set2.add("CSS");

        set1.addAll(set2);
        System.out.println("After addAll: " + set1);

        set1.removeAll(set2);
        System.out.println("After removeAll(set2): " + set1);

        // Clear
        set1.clear();
        System.out.println("After clear(): " + set1);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(50);
        set3.add(20);
        set3.add(10);
        set3.add(40);

        System.out.println("TreeSet: " + set3);
    }
}
