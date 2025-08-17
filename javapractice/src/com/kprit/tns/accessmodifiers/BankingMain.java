package com.kprit.tns.accessmodifiers;

//same package

public class BankingMain {
	public static void main(String[]args) {
		Banking obj=new Banking("Kalyani","ACC2003",5000);    //Creating a new object
		
		System.out.println("Bank Name:"+obj.bankname);   //works bcz public
		
		System.out.println("Account holdername:"+obj.accholdername);  //works bcz default and this class is in the same package.
		
		System.out.println("Account number:"+obj.accnumber);  //works bcz is protected and we’re in the same package.
		
		//System.out.println("Balance:"+obj.balance);   Can’t access balance directly bcz it’s private.
		
		System.out.println("Balance:"+obj.getbalance());   //works bcz getBalance() is public, even though balance is private.
		
	}
}
