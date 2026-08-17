import java.util.*;

class Student {
    String name;
    int rollNo;
    double marks;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks : " + marks);
    }
}

public class Q1_Student {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Sumit";
        s1.rollNo = 1;
        s1.marks = 89.5;

        s1.display();
    }
}