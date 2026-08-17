import java.util.*;

class Calc{
	float a,b;
	char c;
	public void setData(float x, float y, char z){
		a = x;
		b=y;
		c=z;
	}
	public void checkData(){
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
	public static void main(String args[]){
	Scanner n = new Scanner (System.in);
	float a,b;
	char c;
	System.out.print("Enter A : ");
	a = n.nextFloat();
	System.out.print("Enter B : ");
	b = n.nextFloat();
	System.out.print("Enter operation: ");
	c = n.next().charAt(0);
	Calc obj = new Calc();
	obj.setData(a, b, c);
	obj.checkData();
}

}
