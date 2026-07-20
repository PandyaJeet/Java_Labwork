import java.util.*;

class Prime{
	public static void main(String args[]){
		int perf = 0;
		Scanner n = new Scanner (System.in);
		int no = n.nextInt();
		int flag = 0;
		for (int i = 2;i < no;i++){
			if (no%i == 0)
				flag = 1;
		}
		if (flag != 1)
			System.out.print("Prime");
		else
			System.out.print("Not Prime");
	}
}