import java.util.*;

class FactDoWhile{
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a number for factorial : ");
		int no = n.nextInt();
		long fact = 1;
		int i = 1;
		do{
			fact = fact * i;
			i++;
		}while (i <= no);
		System.out.println("Factorial is " + fact);
	}
}
