
class Student {
    String name;
    int rollNo;

    void setDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name   : " + this.name);
        System.out.println("Roll No: " + this.rollNo);
    }
}

public class Q3_ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails("Sumit", 1);
        s1.display();
    }
}
