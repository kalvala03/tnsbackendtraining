package com.kprit.tns.interfaces;

public class Swiggy implements OnlineOrder {
	public void deliverOrder(String order) {
        System.out.println("Swiggy delivers: " + order);
    }

    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " done via UPI.");
    }
}
