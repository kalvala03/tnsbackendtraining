package javapractice;

public class Unary {
	public static void main(String[] args) {
		int a=15;
		int b=11;
		int c=9;
		
		System.out.println("Pre Inc:"+(++a));
		System.out.println("Post Inc:"+(a++));
		System.out.println("Pre Dec:"+(--a));
		System.out.println("Post Dec:"+(a--));
		
		System.out.println(-b);  //unary minus
		System.out.println(!(b>c));  //unary NOT operator
		System.out.println(~c); //unary bitwise complement
	
	}
}
