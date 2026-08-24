
abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }
}

public class Q19_AbstractClass {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(4);

        System.out.println("Circle Area: " + c.calculateArea());
        System.out.println("Square Area: " + s.calculateArea());
    }
}
