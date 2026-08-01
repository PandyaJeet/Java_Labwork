import java.util.*;

class DataTypes{
	public static void main(String args[]){
		byte b = 10;
		short s = 200;
		int i = 50000;
		long l = 1000000000L;
		float f = 3.14f;
		double d = 3.14159265359;
		char c = 'A';
		boolean bool = true;

		System.out.println("byte    value : " + b + "   size : " + Byte.BYTES );
		System.out.println("short   value : " + s + "   size : " + Short.BYTES);
		System.out.println("int     value : " + i + "   size : " + Integer.BYTES);
		System.out.println("long    value : " + l + "   size : " + Long.BYTES );
		System.out.println("float   value : " + f + "   size : " + Float.BYTES );
		System.out.println("double  value : " + d + "   size : " + Double.BYTES );
		System.out.println("char    value : " + c + "   size : " + Character.BYTES );
		System.out.println("boolean value : " + bool );
	}
}
