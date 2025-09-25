package com.kprit.tns.inheritance;

public class SingleInheritance {
	class Parent{
		int length;
		int width;
		int height;
		Parent(){           //default
			this.length=-1;
			this.width=-1;
			this.height=-1;
		}
		Parent(int length,int width){    //two parameters
			this.length=length;
			this.width=width;
		}
		Parent(int length,int width,int height){    //three parameters
			this.length=length;
			this.width=width;
			this.height=height;
		}
		
	}
	class Child extends Parent{
		int weight;
        Child() {
            super();   
            this.weight = 0;  // default
        }

        Child(int length, int width, int weight) {
            super(length, width);   // calls Parent(int, int)
            this.weight = weight;
        }

        Child(int length, int width, int height, int weight) {
            super(length, width, height);  // calls Parent(int, int, int)
            this.weight = weight;
        }

	}
	public static void main(String[] args) {
		SingleInheritance ob=new SingleInheritance();
		Child obj1 = ob.new Child();
        Child obj2 = ob.new Child(10, 5, 50);
        Child obj3 = ob.new Child(15, 10, 5, 100);

        System.out.println("Obj1 → " + obj1.length + " " + obj1.width + " " + obj1.height + " " + obj1.weight);
        System.out.println("Obj2 → " + obj2.length + " " + obj2.width + " " + obj2.height + " " + obj2.weight);
        System.out.println("Obj3 → " + obj3.length + " " + obj3.width + " " + obj3.height + " " + obj3.weight);

	}
}
