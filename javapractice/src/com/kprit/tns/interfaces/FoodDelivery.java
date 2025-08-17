package com.kprit.tns.interfaces;

public interface FoodDelivery {
	
	// by default variables are public static final in interfaces
	String APPNAME ="FoodExpress";
	
	// An interface is implicitly abstract.No need to use the abstract keyword while declaring an interface. 
	void deliverOrder(String order);
	
	// default method (from Java 8+)
	default void trackOrder(int orderId) {
		System.out.println("Tracking Order #" + orderId + " on " + APPNAME);
	}
	
	// static method (from Java 8+)
    static void appInfo() {
        System.out.println("Welcome to " + APPNAME );
    }

    // private method (from Java 9+)
    private void showDeliveryRules() {
        System.out.println("Delivery should be contactless if requested.");
    }
	
    // default method calling private method
    default void safetyGuidelines() {
        showDeliveryRules();
        System.out.println("Always wear a mask and sanitize hands before delivery.");
    }
	
}
