import java.util.*;

class Perfect{
	public static void main(String args[]){
		int perf = 0;
		Scanner n = new Scanner (System.in);
		System.out.print("Start : ");	
		int start = n.nextInt();
		System.out.print("End : ");	
		int end = n.nextInt();
		for (int j = start ; j<= end ; j++){
		
			for (int i = 1;i<j;i++){
			if (j%i==0)
				perf+=i;
			
		}
			if (perf == j)
				System.out.println(j);
			perf=0;
		}
	}
}