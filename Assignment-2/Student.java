import java.util.*;

class Data{
    String name;
    int rollNo;
    int marks;
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
class Student{
    public static void main(String args[]){
        Data obj = new Data();
        Scanner n = new Scanner (System.in);
        obj.name = n.nextLine();
        obj.rollNo = n.nextInt();
        obj.marks = n.nextInt();
        obj.display();
    }
}
