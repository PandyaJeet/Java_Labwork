import java.util.*;

class LeapYear{
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a year : ");
		int year = n.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(year + " is a Leap Year");
		else
			System.out.println(year + " is not a Leap Year");
	}
}
