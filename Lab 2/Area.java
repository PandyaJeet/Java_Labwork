import java.util.*;
class Area{
	public static void main(String args[]){
	float pi = 3.14f;
	Scanner n = new Scanner (System.in);
	System.out.print("Enter radius : ");
	float i  = n.nextFloat();
	System.out.println("Area of Circle : " + (double)(pi*i*i));	

}
}