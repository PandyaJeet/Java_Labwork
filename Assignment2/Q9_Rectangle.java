
class Rectangle {
    double length;
    double width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(double side) {
        length = side;
        width = side;
    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

public class Q9_Rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println("Area of r1: " + r1.area());
        System.out.println("Area of r2: " + r2.area());
        System.out.println("Area of r3: " + r3.area());
    }
}
