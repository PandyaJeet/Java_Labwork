import java.util.*;

class RelationalLogical{
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter number 1 : ");
		int a = n.nextInt();
		System.out.print("Enter number 2 : ");
		int b = n.nextInt();

		System.out.println("Relational operators :");
		System.out.println("a > b  : " + (a > b));
		System.out.println("a < b  : " + (a < b));
		System.out.println("a >= b : " + (a >= b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));

		System.out.println("Logical operators :");
		System.out.println("(a > 0) && (b > 0) : " + ((a > 0) && (b > 0)));
		System.out.println("(a > 0) || (b > 0) : " + ((a > 0) || (b > 0)));
		System.out.println("!(a == b)          : " + (!(a == b)));
	}
}
