import java.util.*;

class Operator{
	public static void main(String args[]){
	int a,b;
	boolean ans = false;
	a = 10;
	b = 1;
	Scanner n = new Scanner (System.in);
	ans = (a>b || a>b);
	System.out.println(ans);
	ans = (a>b && a>b);
	System.out.println(ans);
	ans = (a<b || a<b);
	System.out.println(ans);
	ans = (a<b && a<b);
	System.out.println(ans);
	ans = !(a==b);
	System.out.println(ans);
}
}
