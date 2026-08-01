import java.util.*;

class Arithmetic{
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int a = n.nextInt();
		System.out.print("Enter number 2 : ");
		int b = n.nextInt();
		System.out.println("Addition       : " + (a + b));
		System.out.println("Subtraction    : " + (a - b));
		System.out.println("Multiplication : " + (a * b));
		System.out.println("Division       : " + (a / b));
		System.out.println("Modulus        : " + (a % b));
	}
}
