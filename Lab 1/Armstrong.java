import java.util.*;

class Armstrong{
	public static void main(String args[]){
	Scanner n = new Scanner(System.in);
	int no = n.nextInt();
	int arm=0;
	int org = no;
	while (no!=0){
		arm+=(no%10)^3;
		no=no/10;
	}
	System.out.println(arm);		
}
}