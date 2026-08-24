
class Student {
    String name;
    int rollNo;
    double marks;

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks  : " + marks);
        System.out.println("-----------------------");
    }
}

public class Q2_MultipleObjects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Dhruv";
        s1.rollNo = 1;
        s1.marks = 89.5;

        Student s2 = new Student();
        s2.name = "Riya";
        s2.rollNo = 2;
        s2.marks = 92.0;

        Student s3 = new Student();
        s3.name = "Aman";
        s3.rollNo = 3;
        s3.marks = 76.25;

        s1.display();
        s2.display();
        s3.display();
    }
}
