import java.util.*;

class CircleArea{
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter radius : ");
		double r = n.nextDouble();
		double area = 3.14 * r * r;
		System.out.println("Area of circle is " + area);
	}
}
