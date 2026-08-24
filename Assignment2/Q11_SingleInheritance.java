
class Person {
    String name;
    int age;

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    void setSalary(double salary) {
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

public class Q11_SingleInheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setDetails("Sumit", 24);
        e1.setSalary(45000);

        e1.display();
        e1.displaySalary();
    }
}
