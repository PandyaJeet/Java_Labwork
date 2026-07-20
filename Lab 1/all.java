import java.util.*

class all{
    public static void fact(String args[]){
	Scanner n = new Scanner(System.in);
	System.out.print("Enter a number for factorial : ");
	int o = n.nextInt();
	int fact = 1;
	for(int i = o ; i>0 ; i--){
		fact = i*fact;
	}
	System.out.println("Factorial is " + fact);
}
    public static void reverse(String args[]){
	Scanner n = new Scanner (System.in);
	int no = n.nextInt();
	int rev=0;
	while(no!=0){
	rev=rev*10+no%10;
	no=no/10;
}
	System.out.println(rev);
}
    public static void swap(String args[]){
	int a = 10;
	int b = 20;
	System.out.println("A is " + a + " B is " + b);
	a = a + b ; 
	b = a - b;
	a = a - b;
	System.out.println("A is " + a + " B is " + b);
}
    public static void Palindrome(String args[]){
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
    public static void mean(String args[]){
		Scanner n = new Scanner(System.in);
		System.out.print("Enter no1 : ");
		int n1 = n.nextInt();
		System.out.print("Enter no2 : ");
		int n2 = n.nextInt();
		System.out.print("Enter no3 : ");
		int n3 = n.nextInt();
		System.out.println("Mean is " + ((n1+n2+n3)/3));
	}
    public static void perfect(String args[]){
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
    public static void prime(String args[]){
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
    public static void armstrong(String args[]){
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