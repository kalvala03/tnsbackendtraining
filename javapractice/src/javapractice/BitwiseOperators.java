package javapractice;

public class BitwiseOperators {

	public static void main(String[] args) {
		int a =5;
        int b = 10;
      
        System.out.println("a & b : " + (a & b)); //Bitwise AND
        System.out.println("a | b : " + (a | b)); //Bitwise OR
        System.out.println("a ^ b : " + (a ^ b));  //Bitwise XOR
        System.out.println("~a : " + (~a));  //Bitwise Complement 
        System.out.println("a  << 2 : " + (a << 2)); //Left Shift
        System.out.println("a >> 1 : " + (a >> 1));  //Signed Right Shift
        System.out.println("b >>> 1 : " + (b >>> 1));  //Unsigned Right Shift

	}

}
