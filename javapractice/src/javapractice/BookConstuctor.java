package javapractice;

public class BookConstuctor {
	String Author;
	String Title;
	int publicationyear;
	
	/*
	//In Java, if we don’t initialize instance variables, they automatically get default values 
	// for example, null for objects like String and 0 for numeric types like int.
	BookConstuctor(){
		// No initialization here
	    System.out.println("Default Book created.");
	}
	
	//Calling another constructor using this(...)
	BookConstuctor() {
	        this("Sucheta Raj Khanna", "The Stars Light the Way", 2025); // here  Calls parameterized constructor
	        System.out.println("This is a Default Constructor");
	    }
	*/
	
	
	// 1. Default Constructor (No-argument constructor)
    // Automatically provided by Java if no other constructor is defined.
    // Initializes instance variables with default values.
	BookConstuctor(){
		this.Author="Sucheta Raj Khanna";
		this.Title="The Stars Light the Way";
		this.publicationyear=2025;
		System.out.println("This is a Default Constructor");
	}
	
	// 2. Parameterized Constructor
	// Uses this to differentiate between instance variables and parameters
	BookConstuctor(String author,String title,int publicationyear){
		
		this.Author=author;  
		this.Title=title;    	
		this.publicationyear=publicationyear;
		System.out.println("This is a Parameterized Constructor");
	}
	
	// 3. Copy Constructor
    // Creates a new object by copying the values of an existing object.
	// Uses this to assign from another object
	BookConstuctor(BookConstuctor dupbook){
		this.Author=dupbook.Author;
		this.Title=dupbook.Title;
		this.publicationyear=dupbook.publicationyear;
		System.out.println("This is a copy Constructor");
	}
	
	 //  Method that uses this to refer to the current object
    void printThisObject() {
        System.out.println("Current object reference: " + this);
    }
	
    //  Method chaining using this
    BookConstuctor setAuthor(String Author) {
        this.Author = Author;
        return this; // returns the current object
    }
    
    BookConstuctor setTitle(String Title) {
        this.Title = Title;
        return this;
    }
    
    BookConstuctor setPublicationYear(int year) {
        this.publicationyear = year;
        return this;
    }



	public static void main(String[]args) {
		
		//uses default constuctor
		BookConstuctor bc1=new BookConstuctor();   
		System.out.println(bc1.Author);
		System.out.println(bc1.Title);
		System.out.println(bc1.publicationyear);
		
		// Call the method to print the current object reference
		bc1.printThisObject();
		
		//uses parameterized constructor
		BookConstuctor bc2=new BookConstuctor("AI on Trial","Shri Sujeet Kumar",2025); 
		System.out.println(bc2.Author);
		System.out.println(bc2.Title);
		System.out.println(bc2.publicationyear);
		
		//uses copy constructor
		BookConstuctor bc3=new BookConstuctor(bc2);   // copies book2(bc2)
		System.out.println(bc3.Author);
		System.out.println(bc3.Title);
		System.out.println(bc3.publicationyear);
		
		// Method chaining example
        bc1.setAuthor("Kalyani")
           .setTitle("Learning Java")
           .setPublicationYear(2026);
        System.out.println(bc1.Author);
        System.out.println(bc1.Title);
        System.out.println(bc1.publicationyear);
		
		}
}
