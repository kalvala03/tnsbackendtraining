package com.kprit.tns.acesspack2;

//different package
//Import needed because Banking is public.

import com.kprit.tns.accessmodifiers.Banking;

public class PremiumAccount extends Banking{      //subclass
	
	public PremiumAccount(String accholdername,String accnumber,double balance) {
		 super(accholdername, accnumber, balance); 
	}
	
	public void accInfo() {
		 System.out.println("Bank: " + bankname);  //works bcz public

	  // System.out.println(accholdername);   not accessible as it is default, and we’re in a different package.

	     System.out.println("Account Number: " + accnumber);  //accessible as it is protected and in subclass of diff package.

	     System.out.println("Balance: " + getbalance());  //Works bcz public.
	}
}
