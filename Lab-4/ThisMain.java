import java.util.Scanner;

class Student1{
    int rollNo,marks;
    String name;
    public void setData(int rollNo, int marks, String name){
        this.rollNo = rollNo;
        this.marks=marks;
        this.name = name;
    }
    public void display(){
        System.out.println("Student name : " + name + "\nRoll No : " + rollNo + "\nMarks : " + marks );
    }
}
class ThisMain{
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        Student1 obj = new Student1 ();
        System.out.print("Enter Student Name : ");
        String name = n.nextLine();
        System.out.print("Enter Student Roll No : ");
        int rn = n.nextInt();
        System.out.print("Enter Student Marks : ");
        int marks = n.nextInt();
        obj.setData(rn, marks, name);
        obj.display();
        n.close();
        
    }
}