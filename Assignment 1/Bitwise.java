import java.util.*;

class Bitwise{
	public static void main(String args[]){
		int a = 12;   
		int b = 10;   
		System.out.println("a = " + a + " , b = " + b);
		System.out.println("a & b  (AND)         : " + (a & b));
		System.out.println("a | b  (OR)          : " + (a | b));
		System.out.println("a ^ b  (XOR)         : " + (a ^ b));
		System.out.println("~a     (NOT)         : " + (~a));
		System.out.println("a << 2 (left shift)  : " + (a << 2));
		System.out.println("a >> 2 (right shift) : " + (a >> 2));
	}
}
