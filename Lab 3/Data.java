import java.util.*;

class Data{
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		byte a; 
		short b; 
		int c; 
		long d; 
		float e; 
		double f; 
		char g; 
		boolean h;
		System.out.println("Enter byte value: ");
		a = n.nextByte();
		System.out.println("Enter Short value: ");
		b = n.nextShort();
		System.out.println("Enter Int value: ");
		c = n.nextInt();
		System.out.println("Enter Long value: ");
		d = n.nextLong();
		System.out.println("Enter Float value: ");
		e = n.nextFloat();
		System.out.println("Enter Double value: ");
		f = n.nextDouble();
		System.out.println("Enter Char value: ");
		g = n.next().charAt(0);
		System.out.println("Enter Bool value: ");
		h = n.nextBoolean();
		
		System.out.println("Byte : " + a + "\nShort : " + b + "\nInt : " + c + "\nLong : " + d + "\nFloat : "+ e+ "\nDouble : " + f + "\nChar : " + g +"\nBool : "+h);
	}

}