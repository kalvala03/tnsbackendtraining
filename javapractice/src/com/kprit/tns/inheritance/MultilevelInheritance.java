package com.kprit.tns.inheritance;

public class MultilevelInheritance {
	class WhatsappV1{
		WhatsappV1(){
			System.out.println("Text Messaging feature");		
		}
	}
	class WhatsappV2 extends WhatsappV1{
		WhatsappV2() {
			System.out.println("Voice Calling feature");	
		}
	}
	class WhatsappV3 extends WhatsappV2{
		WhatsappV3() {
			System.out.println("Video Calling feature");	
		}
	}
	public static void main(String[]args) {
		MultilevelInheritance ob=new MultilevelInheritance();
		WhatsappV3 obj=ob.new WhatsappV3();
		
	}
}
