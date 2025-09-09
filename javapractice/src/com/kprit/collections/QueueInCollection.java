package com.kprit.collections;

import java.util.*;

public class QueueInCollection {

    public static void main(String[] args) {
    /*  ArrayDeque → resizable array, fast insert/delete from both ends, no capacity limit.
 						Use for stack (LIFO) or queue (FIFO) operations.

		PriorityQueue → orders elements based on priority (natural order or comparator).
		 				Use when you need elements processed by priority.
		
		LinkedList(as Queue) → supports queue operations (offer, poll, peek), allows nulls.
						Use when you need a simple FIFO queue with flexibility. */

        Queue<String> queue = new LinkedList<>();

        // Addition
        queue.add("Kalyani");
        queue.add("Java");
        queue.add("Python");
        queue.add("C++");

        System.out.println("Queue: " + queue);

        // Retrieval
        System.out.println("Peek (front element): " + queue.peek());

        // Verification
        System.out.println("Contains Python? " + queue.contains("Python"));
        System.out.println("Is Empty? " + queue.isEmpty());

        // Deletion
        System.out.println("Removed element: " + queue.remove());
        System.out.println("After remove(): " + queue);

        // Poll (removes head or null if empty)
        System.out.println("Polled element: " + queue.poll());
        System.out.println("After poll(): " + queue);

        // Bulk addition
        Queue<String> q2 = new PriorityQueue<>();
        q2.add("HTML");
        q2.add("CSS");

        queue.addAll(q2);
        System.out.println("After addAll(q2): " + queue);

        // Clear
        queue.clear();
        System.out.println("After clear(): " + queue);
    }
}
