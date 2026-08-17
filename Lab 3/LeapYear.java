import java.util.*;

class LeapYear{
	float num;
	public void setData(float n){
		num=n;
	}
	public void checkData(){
		if(num%4==0)
			System.out.println("Is a Leap Year");
		else
			System.out.println("Not a Leap year");
	}
	public static void main(String args[]){
		LeapYear obj = new LeapYear();
		Scanner n = new Scanner(System.in);
		System.out.print("Enter Data: ");
		float no = n.nextFloat();
		obj.setData(no);
		obj.checkData();
	}
}