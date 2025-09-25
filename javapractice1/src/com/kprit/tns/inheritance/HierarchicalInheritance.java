package com.kprit.tns.inheritance;

public class HierarchicalInheritance {
	class Laptop{
		Laptop(){
			System.out.println("Display");
		}
	}
	class GamingLaptop extends Laptop{
		GamingLaptop(){
			System.out.println("Highperformance");
		}
	}
	class BusinessLaptop extends Laptop{
		BusinessLaptop(){
			System.out.println("Secure and Reliable");
		}
	}
	class StudentLaptop extends Laptop{
		StudentLaptop(){
			System.out.println("Affordable and Lightweight");
		}
	}
	public static void main(String[] args) {
		HierarchicalInheritance ob=new HierarchicalInheritance();
		GamingLaptop obj=ob.new GamingLaptop();
		BusinessLaptop obj1=ob.new BusinessLaptop();
		StudentLaptop obj2=ob.new StudentLaptop();
	}

}
