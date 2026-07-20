import java.util.*;

class Mean{
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter no1 : ");
		int n1 = n.nextInt();
		System.out.print("Enter no2 : ");
		int n2 = n.nextInt();
		System.out.print("Enter no3 : ");
		int n3 = n.nextInt();
		System.out.println("Mean is " + ((n1+n2+n3)/3));
	}
}
