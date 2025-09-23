package com.collections;

import java.util.*;
import java.util.Map.Entry;

public class MapInCollection {

    public static void main(String[] args) {
    	/* HashMap → key-value pairs, no order, allows one null key & multiple null values.
					Use when you just need fast search.

			LinkedHashMap → same as HashMap but maintains insertion order. 
					Use when you need fast search + predictable order.

			TreeMap → key-value pairs, keys sorted in ascending order, no null key.
					Use when you need sorted keys.

			Hashtable → legacy, synchronized, no null key/value.
					Use only when you need thread safety and can’t use ConcurrentHashMap. */
        
        
        HashMap<Integer,String> m = new HashMap<>(); 

        // Addition of elements (put key-value pairs)
        m.put(501,"Kalyani");
        m.put(502,"Pravalika");
        m.put(503,"Ram");
        m.put(504,"Sita");
        m.put(502,"Kalpana"); // overwrites old value for key=502
        System.out.println("Initial HashMap: " + m);

        // Retrieval 
        System.out.println("Get value for key 502: " + m.get(502)); // returns value or null
        System.out.println("Keys: " + m.keySet());       // all keys
        System.out.println("Values: " + m.values());     // all values
        System.out.println("Entries: " + m.entrySet());  // all key-value pairs

        // Values iteration
        System.out.println("\nIterating values:");
        Collection<String> values = m.values();
        for(String val : values) {
            System.out.println(val);
        }

        // Keys iteration
        System.out.println("\nIterating keys:");
        Set<Integer> keys = m.keySet();    
        for(Integer key : keys) {
            System.out.println(key);
        }

        // Key-Value using keySet
        System.out.println("\nKey-Value using keySet:");
        for(Integer key : keys) {
            System.out.println(key + " -- " + m.get(key));
        }

        // Key-Value using entrySet
        System.out.println("\nKey-Value using entrySet:");
        Set<Entry<Integer,String>> entries = m.entrySet();
        for(Entry<Integer,String> entry : entries) {
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        // Verification 
        System.out.println( m.containsKey(501));
        System.out.println( m.containsValue("Sita"));
        System.out.println(m.isEmpty());

        //Deletion 
        m.remove(501); // remove by key
        System.out.println("After remove(501): " + m);

        m.putIfAbsent(505, "Lakshman"); // add only if key not present
        System.out.println(m);

        m.replace(503, "Krishna"); // replace value at key=503
        System.out.println("After replace(503, Krishna): " + m);
        
        Map<Integer, String> sortedMap = new TreeMap<>();
        sortedMap.put(20, "Spring");
        sortedMap.put(10, "Hibernate");
        sortedMap.put(30, "JPA");

        System.out.println("\nTreeMap (Sorted by keys): " + sortedMap);
    }
}
