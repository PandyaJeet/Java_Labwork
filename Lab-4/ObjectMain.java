import java.util.Scanner;

class Student{
    int rollNo,marks;
    String name;
    public void setData(int roll, int mark, String n){
        rollNo = roll;
        marks=mark;
        name = n;
    }
    public void display(){
        System.out.println("Student name : " + name + "\nRoll No : " + rollNo + "\nMarks : " + marks );
    }
}
class ObjectMain{
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        Student obj = new Student ();
        System.out.print("Enter Student Name : ");
        String name = n.nextLine();
        System.out.print("Enter Student Roll No : ");
        int rn = n.nextInt();
        System.out.print("Enter Student Marks : ");
        int marks = n.nextInt();
        obj.setData(rn, marks, name);
        obj.display();
        
        
    }
}