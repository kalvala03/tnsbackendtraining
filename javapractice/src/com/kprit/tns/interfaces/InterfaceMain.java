package com.kprit.tns.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		OnlineOrder order1 = new Zomato();
        order1.deliverOrder("Pizza");
        order1.pay(299);
        order1.trackOrder(101);
        order1.safetyGuidelines();

        System.out.println();

        OnlineOrder order2 = new Swiggy();
        order2.deliverOrder("Burger");
        order2.pay(199);
        order2.trackOrder(102);
        order2.safetyGuidelines();

        // Calling static method from interface directly
        FoodDelivery.appInfo();
	}

}
