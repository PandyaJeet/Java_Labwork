import java.util.*;

class Fact{
	public static void main(String args[]){
	Scanner n = new Scanner(System.in);
	System.out.print("Enter a number for factorial : ");
	int o = n.nextInt();
	int fact = 1;
	for(int i = o ; i>0 ; i--){
		fact = i*fact;
	}
	System.out.println("Factorial is " + fact);
}

}