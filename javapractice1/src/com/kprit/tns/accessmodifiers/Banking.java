package com.kprit.tns.accessmodifiers;

public class Banking {   //public → this class can be accessed from anywhere, even from other packages.
	
	String accholdername;    //no modifier(default):Accessible only inside the same package (banking).
	public String bankname="SBI";   //accessible from anywhere.
	protected String accnumber;  //protected → accessible in same package and by subclasses in different packages.
	private double balance; //balance is private, so only Banking class itself can see/change it.
	
	
	public Banking(String accholdername,String accnumber,double balance){
		this.accholdername=accholdername;
		this.accnumber=accnumber;
		this.balance=balance;  //private balance is still set inside the constructor bcz we’re inside the same class.
	}
	
	//Encapsulation
	public double getbalance() {     //Getter method → gives controlled access to private balance.
		return balance;
	}
	
	//private method can be used only internally
	 private void updatebalance(double amt) {
		 balance+=amt;
	 }
	 
	 
	 //public method so customers can call it 
	 public void deposit(double amt) {
		 updatebalance(amt);    //calling private method inside public method
		 System.out.println("Deposited: " + amt);
	 }
}
