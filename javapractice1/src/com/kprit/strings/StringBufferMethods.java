package com.kprit.strings;

//StringBuffer and StringBuilder share the same set of methods
public class StringBufferMethods {
	public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append() → adds string at the end
        sb.append(" World");
        System.out.println("append(): " + sb);
        // 2. insert() → inserts string at specific index
        sb.insert(6, "Java ");
        System.out.println("insert(): " + sb);

        // 3. replace() → replaces characters from start to end index
        sb.replace(6, 10, "C++");
        System.out.println("replace(): " + sb);

        // 4. delete() → deletes characters from start to end index
        sb.delete(6, 9);
        System.out.println("delete(): " + sb);

        // 5. deleteCharAt() → deletes character at specific index
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt(): " + sb);

        // 6. reverse() → reverses the content
        sb.reverse();
        System.out.println("reverse(): " + sb);
        sb.reverse(); // reverse back to original

        // 7. capacity() → current/default buffer capacity
        System.out.println("capacity(): " + sb.capacity());

        // 8. ensureCapacity() → increases capacity if needed
        sb.ensureCapacity(50);
        System.out.println("ensureCapacity(50), capacity now: " + sb.capacity());

        // 9. length() → number of characters
        System.out.println("length(): " + sb.length());

        // 10. charAt() → returns character at given index
        System.out.println("charAt(1): " + sb.charAt(1));

        // 11. setCharAt() → changes character at given index
        sb.setCharAt(1, 'A');
        System.out.println("setCharAt(1,'A'): " + sb);

        // 12. substring() → extracts part of string
        System.out.println("substring(0,5): " + sb.substring(0, 5));

        // 13. indexOf() → finds index of substring
        System.out.println("indexOf(\"World\"): " + sb.indexOf("World"));

        // 14. lastIndexOf() → finds last occurrence of substring
        System.out.println("lastIndexOf(\"o\"): " + sb.lastIndexOf("o"));

        // 15. setLength() → sets length (truncates/extends with nulls)
        sb.setLength(5);
        System.out.println("setLength(5): " + sb);

        // 16. trimToSize() → reduces capacity to current length
        sb.trimToSize();
        System.out.println("trimToSize(), capacity: " + sb.capacity());
    }

}
