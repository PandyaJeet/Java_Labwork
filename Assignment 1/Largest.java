import java.util.*;

class Largest{
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter no1 : ");
		int a = n.nextInt();
		System.out.print("Enter no2 : ");
		int b = n.nextInt();
		System.out.print("Enter no3 : ");
		int c = n.nextInt();

		if (a >= b){
			if (a >= c)
				System.out.println(a + " is the largest");
			else
				System.out.println(c + " is the largest");
		}
		else{
			if (b >= c)
				System.out.println(b + " is the largest");
			else
				System.out.println(c + " is the largest");
		}
	}
}
