import java.util.*;

class Calculator{
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		Int a = n.nextInt();
		System.out.print("Enter number 2 : ");
		Int b = n.nextInt();
		System.out.print("Enter operator (+ - * /) : ");
		char op = n.next().charAt(0);

		switch (op){
			case '+' :
				System.out.println("Result : " + (a + b));
				break;
			case '-' :
				System.out.println("Result : " + (a - b));
				break;
			case '*' :
				System.out.println("Result : " + (a * b));
				break;
			case '/' :
				if (b != 0)
					System.out.println("Result : " + (a / b));
				else
					System.out.println("Cannot divide by zero");
				break;
			default :
				System.out.println("Invalid operator");
		}
	}
}
