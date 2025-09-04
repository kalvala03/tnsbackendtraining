package com.kprit.strings;
import java.util.Scanner;

public class StringMethods {
	    public static void main(String[] args) {
	        String str = "Kalyani";
	        String str2 = "   Java Programming   ";
	        String str3="";
	        String str4="  ";

	        // 1. length() → returns the number of characters in the string
	        System.out.println("Length of str: " + str.length());
	        System.out.println("Length of str2: " + str2.length());

	        // 2. charAt() → returns the character at a given index(String is zero index-based)
	        System.out.println("charAt(2): " + str.charAt(2));

	        // 3. substring(beginIndex) → extracts substring from index to end
	        System.out.println("substring(3): " + str.substring(3));

	        // 4. substring(beginIndex, endIndex) → extracts substring in range (end is exclusive)
	        System.out.println("substring(0,4): " + str.substring(0,4));

	        // 5. contains() → checks if substring exists inside the string
	        System.out.println("contains(): " + str.contains("yan"));

	        // 6. equals() → compares contents (case-sensitive)
	        System.out.println("equals(): " + str.equals("Kalyani"));

	        // 7. equalsIgnoreCase() → compares contents ignoring case
	        System.out.println("equalsIgnoreCase(): " + str.equalsIgnoreCase("kalyani"));

	        // 8. isEmpty() → checks if string length is 0
	        System.out.println("isEmpty(): " + str3.isEmpty());
	        
	        // diff between isBlank() & isEmpty():
	        //isEmpty → checks size including whitespaces-returns true if len is 0.
	        //isBlank → checks size and ignores whitespace.

	        System.out.println("isEmpty(): " + str4.isEmpty());
	        System.out.println("isEmpty(): " + str4.isBlank());

	        // 9. concat() → joins two strings
	        System.out.println("concat: " + str.concat(" Rocks"));

	        // 10. replace() → replaces a character/sequence with another
	        System.out.println("replace: " + str.replace('a','A'));

	        // 11. replaceAll() → replaces using regex pattern
	        System.out.println("replaceAll: " + str.replaceAll("[aeiou]","*"));

	        // 12. indexOf() → returns first occurrence index of char/substring
	        System.out.println("indexOf('a'): " + str.indexOf('a'));

	        // 13. lastIndexOf() → returns last occurrence index
	        System.out.println("lastIndexOf('a'): " + str.lastIndexOf('a'));

	        // 14. toUpperCase() → converts to uppercase
	        System.out.println("toUpperCase: " + str.toUpperCase());

	        // 15. toLowerCase() → converts to lowercase
	        System.out.println("toLowerCase: " + str.toLowerCase());

	        // 16. trim() → removes leading(Starting) and trailing(ending) spaces
	        System.out.println("trim:"+ str2.trim());

	        // 17. startsWith() → returns true if string begins with given prefix
	        System.out.println("startsWith(): " + str.startsWith("Kal"));

	        // 18. endsWith() → returns true if string ends with given suffix
	        System.out.println("endsWith(): " + str.endsWith("ni"));

	        // 19. split() → breaks string into parts using delimiter
	        String s3 = "apple,banana,orange";
	        String[] fruits = s3.split(",");
	        System.out.println("split(): ");
	        for(String f : fruits){
	            System.out.println(f);
	        }

	        // 20. valueOf() → converts other data types into string
	        int num = 100;
	        String numStr = String.valueOf(num);
	        System.out.println("valueOf method: " + numStr);

	        // 21. matches() → checks if string matches regex pattern
	        System.out.println("matches(): " + str.matches("[A-Za-z]+"));

	        // 22. compareTo() → lexicographically(dictionary order) compares ,(case-sensitive)
	        //Returns an integer:
	        //0 → if both strings are equal
	        //Positive value → if current string (str) is greater than the argument
	        //Negative value →if  current string (str) is smaller than the argument
	        
	        System.out.println("compareTo(): " + str.compareTo("Kalyani"));
	        System.out.println("compareTo(): " + str.compareTo("Kalyan"));
	        System.out.println("compareTo(): " + str.compareTo("Kalyanii"));

	        // 23. compareToIgnoreCase() → lexicographically compares ignoring case
	        System.out.println("compareToIgnoreCase(\"kalyani\"): " + str.compareToIgnoreCase("kalyani"));

	        // 24. join() → joins multiple strings with a delimiter
	        //Syntax:String.join(CharSequence delimiter, CharSequence... elements)
	        String s = String.join("-", "Java", "Python", "C");
	        System.out.println("join: " + s);

	        // 25. format() → formats strings with placeholders
	        String s2 = String.format("My name is %s and I am %d years old", "Kalyani", 22);
	        System.out.println("format: " + s2);

	        // 26. toCharArray() → converts string into char array
	        char[] chars = str.toCharArray();
	        System.out.print("toCharArray: ");
	        for(char c : chars){
	            System.out.print(c + ",");
	        }
	        System.out.println();

	    }

}
