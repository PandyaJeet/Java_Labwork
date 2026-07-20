import java.util.*;

class Reverse{
	public static void main(String args[]){
	Scanner n = new Scanner (System.in);
	int no = n.nextInt();
	int rev=0;
	while(no!=0){
	rev=rev*10+no%10;
	no=no/10;
}
	System.out.println(rev);
}

}