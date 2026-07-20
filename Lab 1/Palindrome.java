import java.util.*;

class Palindrome{
	public static void main(String args[]){
	Scanner n = new Scanner (System.in);
	int no = n.nextInt();
	int org = no;
	int rev=0;
	while(no!=0){
	rev=rev*10+no%10;
	no=no/10;
}
	if(rev == org)
		System.out.println("Palindrome");
	else
		System.out.println("Not a variable");
}

}