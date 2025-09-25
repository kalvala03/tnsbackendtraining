package com.kprit.tns.interfaces;

public class Zomato implements OnlineOrder {
	public void deliverOrder(String order) {
        System.out.println("Zomato delivers: " + order);
    }

    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " done via Zomato Wallet.");
    }
}
