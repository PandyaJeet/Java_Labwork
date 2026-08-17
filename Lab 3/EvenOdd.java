import java.util.*;

class EvenOdd{
	float num;
	public void setData(float n){
		num=n;
	}
	public void checkData(){
		if((num%2) == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
	public static void main(String args[]){
		EvenOdd obj = new EvenOdd();
		Scanner n = new Scanner(System.in);
		System.out.print("Enter Data: ");
		float no = n.nextFloat();
		obj.setData(no);
		obj.checkData();
	}
}