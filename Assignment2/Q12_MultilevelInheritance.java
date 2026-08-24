
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on land");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks");
    }
}

public class Q12_MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.walk();
        d.bark();
    }
}
