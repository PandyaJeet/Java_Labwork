import java.util.*;
class Animal{
    String name;
}
class Mammal extends Animal{
    public void set(String name){
        this.name = name;
    }
}
class Dog extends Mammal{
    public void display(){
        System.out.println("Name : " + name);
    }
}
class MultiMain {
    public static void main(String args[]){
        Dog obj = new Dog();
        Scanner n = new Scanner (System.in);
        System.out.print("Enter name : ");
        String name = n.nextLine();
        obj.set(name);
        obj.display();
    }
}
