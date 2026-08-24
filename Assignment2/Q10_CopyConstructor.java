
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    Student(Student s) {
        this.name = s.name;
        this.rollNo = s.rollNo;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class Q10_CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("Sumit", 1);
        Student s2 = new Student(s1);

        s1.display();
        s2.display();
    }
}
