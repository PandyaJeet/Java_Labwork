import java.util.*;

class BreakContinue{
	int num;
	public void setData(int n){
		num = n;
	}
	public void checkData(){
		for(int i = 0 ; i<num;i++){
			if(i==10)
				break;
			if(i%2==0)
				continue;
			System.out.println(i);
		}
	}
	public static void main(String args[]){
		Scanner n = new Scanner(System.in);
		BreakContinue obj = new BreakContinue();
		int num = n.nextInt();
		obj.setData(num);
		obj.checkData();
	}
}