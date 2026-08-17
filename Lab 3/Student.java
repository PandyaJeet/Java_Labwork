import java.util.*;
class Student{
	public static void main(String args[]){
		int stud_id;
		String stud_name, stud_uni;
		Scanner n = new Scanner(System.in);
		System.out.print("Enter Student id : ");
		stud_id = n.nextInt();
		System.out.print("Enter Student name : ");
		stud_name = n.next();
		System.out.print("Enter Student University : ");
		stud_uni = n.next();
		System.out.println("Entered data\nStudent id : " + stud_id + "\nStudent Name : " + stud_name + "\nStudent University : " + stud_uni  );
	}
}