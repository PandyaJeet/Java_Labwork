import java.util.*;

class BreakContinue{
	public static void main(String args[]){
		System.out.println("Using continue (skips 5) :");
		for (int i = 1 ; i <= 10 ; i++){
			if (i == 5)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("Using break (stops at 8) :");
		for (int i = 1 ; i <= 10 ; i++){
			if (i == 8)
				break;
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
