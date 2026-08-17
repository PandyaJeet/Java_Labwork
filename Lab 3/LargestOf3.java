import java.util.*;

class LargestOf3{
	int n1,n2,n3;
	public void setData(int a,int b, int c){
		n1=a;
		n2=b;
		n3=c;
	}
	public void checkData(){
		if(n1>n2 ){
			if(n1>n3){
				System.out.println(n1 + " is the greatest");
			}			
		}
		else if(n2>n3 ){
			if(n2>n1){
				System.out.println(n2 + " is the greatest");
			}			
		}
		else if(n3>n2 ){
			if(n3>n1){
				System.out.println(n3 + " is the greatest");
			}			
		}
		else
			System.out.println("All are equal");
	}
	public static void main(String args[]){
		LargestOf3 obj = new LargestOf3();
		Scanner n = new Scanner (System.in);
		int a = n.nextInt();
		int b = n.nextInt();
		int c = n.nextInt();
		obj.setData(a,b,c);
		obj.checkData();
	}
}