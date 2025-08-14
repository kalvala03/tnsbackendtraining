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
    // Allows initializing instance variables with specific values at object creation.
	BookConstuctor(String author,String title,int publicationyear){
		//Without this, both title and title refer to the parameter — so the instance variable wouldn’t be updated.
		this.Author=author;  // "author" → parameter
		this.Title=title;    // "this.title" → instance variable	
		this.publicationyear=publicationyear;
		System.out.println("This is a Parameterized Constructor");
	}
	
	// 3. Copy Constructor
    // Creates a new object by copying the values of an existing object.
	BookConstuctor(BookConstuctor dupbook){
		this.Author=dupbook.Author;
		this.Title=dupbook.Title;
		this.publicationyear=dupbook.publicationyear;
		System.out.println("This is a copy Constructor");
	}

	public static void main(String[]args) {
		
		//uses default constuctor
		BookConstuctor bc1=new BookConstuctor();   
		System.out.println(bc1.Author);
		System.out.println(bc1.Title);
		System.out.println(bc1.publicationyear);
		
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
		}
}
