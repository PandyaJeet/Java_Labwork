import java.util.*;

class DayOfWeek{
	int num;
	public void setData(int n){
		num=n;
	}
	public void checkData(){
		switch(num){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
		}
	}	
	public static void main(String args[]){
		DayOfWeek obj = new DayOfWeek();
		Scanner n = new Scanner(System.in);
		System.out.print("Enter Data: ");
		int no = n.nextInt();
		obj.setData(no);
		obj.checkData();
		n.close();
	}
}