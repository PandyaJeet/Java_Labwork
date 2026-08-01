import java.util.*;

class Compound{
	public static void main(String args[]){
		int a = 100;
		System.out.println("Start    a : " + a);
		a += 10;
		System.out.println("a += 10 -> " + a);
		a -= 20;
		System.out.println("a -= 20 -> " + a);
		a *= 2;
		System.out.println("a *= 2  -> " + a);
		a /= 3;
		System.out.println("a /= 3  -> " + a);
		a %= 7;
		System.out.println("a %= 7  -> " + a);
	}
}
