import java.util.*;

class EvenOdd{
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int no = n.nextInt();
		if (no % 2 == 0)
			System.out.println(no + " is Even");
		else
			System.out.println(no + " is Odd");
	}
}
