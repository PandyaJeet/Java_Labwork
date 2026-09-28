import java.util.Scanner;

abstract class Shape {
    int a,b;
    abstract void calculateArea();
}
class Circle extends Shape{
    Circle(int a){
        this.a = a;
    }
    void calculateArea(){    
        System.out.println("Area of Circle : " + (3.14*a*a));
    }
}
class Square extends Shape{
    Square(int a){
        this.a = a;
    }
    void calculateArea(){
        System.out.println("Area of Square : " + (a*a));
    }
}
class Area{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter Radius of Circle : ");
        int a = n.nextInt();
        Circle obj = new Circle(a);
        obj.calculateArea();
        System.out.println("Enter height of square : ");
        int b = n.nextInt();
        Square obj1 = new Square(b);
        obj1.calculateArea();
    }
}