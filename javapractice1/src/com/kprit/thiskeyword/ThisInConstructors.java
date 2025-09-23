package com.kprit.thiskeyword;

public class ThisInConstructors {
	
	//Instance Variables
	String Author;
	String Title;
	int publicationyear;
	
	/*
	//Calling another constructor using 'this'(...)
	public ThisInConstructors () {
		 this("Sucheta Raj Khanna", "The Stars Light the Way", 2025); // here  Calls parameterized constructor
		 System.out.println("This is a Default Constructor");
	}
	*/
	
	 // Initializes instance variables 
	public ThisInConstructors(){
		this.Author="Sucheta Raj Khanna";
		this.Title="The Stars Light the Way";
		this.publicationyear=2025;
		System.out.println("This is a Default Constructor");
	}
	
	// Uses 'this' to differentiate between instance variables and parameters
	ThisInConstructors(String author,String title,int publicationyear){
		this.Author=author;  
		this.Title=title;    	
		this.publicationyear=publicationyear;
		System.out.println("This is a Parameterized Constructor");
	}
	
	// Uses 'this' to assign from another object
	ThisInConstructors(ThisInConstructors dupbook){
		this.Author=dupbook.Author;
		this.Title=dupbook.Title;
		this.publicationyear=dupbook.publicationyear;
		System.out.println("This is a copy Constructor");
	}
	
	//Method that uses 'this' to refer to the current object
    void printThisObject() {
        System.out.println("Current object reference: " + this);
    }
    
    //Method chaining using 'this'
    ThisInConstructors setAuthor(String Author) {
        this.Author = Author;
        return this; // returns the current object
    }
    
    ThisInConstructors setTitle(String Title) {
        this.Title = Title;
        return this;
    }
    
    ThisInConstructors setPublicationYear(int year) {
        this.publicationyear = year;
        return this;
    }

    
public static void main(String[]args) {
		
		//uses default constuctor
	ThisInConstructors obj1=new ThisInConstructors();   
		System.out.println(obj1.Author);
		System.out.println(obj1.Title);
		System.out.println(obj1.publicationyear);
		
		// Call the method to print the current object reference
		obj1.printThisObject();
		
		//uses parameterized constructor
		ThisInConstructors obj2=new ThisInConstructors("AI on Trial","Shri Sujeet Kumar",2025); 
		System.out.println(obj2.Author);
		System.out.println(obj2.Title);
		System.out.println(obj2.publicationyear);
		
		//uses copy constructor
		ThisInConstructors obj3=new ThisInConstructors(obj2);   // copies book2(bc2)
		System.out.println(obj3.Author);
		System.out.println(obj3.Title);
		System.out.println(obj3.publicationyear);
		
		// Method chaining example
        obj1.setAuthor("Kalyani")
           .setTitle("Learning Java")
           .setPublicationYear(2026);
        System.out.println(obj1.Author);
        System.out.println(obj1.Title);
        System.out.println(obj1.publicationyear);
		
		}
}
