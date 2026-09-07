import java.util.*;
class Person{
    String name;
    int id;
}
class Employee extends Person{
    Employee(String n, int i){
        name = n;
        id = i;
    }
    public void display(){
        System.out.println("=======================");
        System.out.println("Entered Name : " + name);
        System.out.println("Entered ID : " +id);
    }
}
class SingleMain{
    public static void main (String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = n.nextLine();
        System.out.print("Enter Id : ");
        int id = n.nextInt();
        Employee e = new Employee(name, id);
        e.display();
    }
}