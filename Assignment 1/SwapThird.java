import java.util.*;

class SwapThird{
	public static void main(String args[]){
		int a = 10;
		int b = 20;
		System.out.println("Before swap : A is " + a + " B is " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swap : A is " + a + " B is " + b);
	}
}
