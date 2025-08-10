package javapractice;

public class Dowhile {
	public static void main(String[]args) {
		int c=0;
		do {
			System.out.println("Current Count:"+c); // This statement is executed at least once,
													// regardless of whether the condition is true or false.
			c++;
		}while(c<5);

	}
}
