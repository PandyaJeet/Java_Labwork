import java.util.*;

class Calc{
	public static void main(String args[]){
	float a,b;
	char c;
	Scanner n = new Scanner (System.in);
	System.out.print("Enter A : ");
	a = n.nextFloat();
	System.out.print("Enter B : ");
	b = n.nextFloat();
	System.out.print("Enter operation: ");
	c = n.next().charAt(0);
	switch(c){
	case '+':
		System.out.println("A + B = " + (a+b));
		break;
	case '-':
		System.out.println("A - B = " + (a-b));
		break;
	case '*':
		System.out.println("A * B = " + (a*b));
		break;
	case '/':
		System.out.println("A / B = " + (float)(a/b));
		break;

}

}
}