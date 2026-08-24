
class Student {
    String name;
    int rollNo;
    static String collegeName = "ABC College";
    static int studentCount = 0;

    Student(String name) {
        this.name = name;
        studentCount++;
        this.rollNo = studentCount;
    }

    static void showCollegeName() {
        System.out.println("College: " + collegeName);
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", College: " + collegeName);
    }
}

public class Q4_StaticMembers {
    public static void main(String[] args) {
        Student s1 = new Student("Sumit");
        Student s2 = new Student("Riya");
        Student s3 = new Student("Aman");

        s1.display();
        s2.display();
        s3.display();

        Student.showCollegeName();
        System.out.println("Total students: " + Student.studentCount);

        s1.collegeName = "XYZ College";
        s1.display();
        s2.display();
        s3.display();
    }
}
