
class Vehicle {
    String type = "Vehicle";

    Vehicle() {
        System.out.println("Vehicle constructor called");
    }

    void show() {
        System.out.println("Type: " + type);
    }
}

class Car extends Vehicle {
    String type = "Car";

    Car() {
        super();
        System.out.println("Car constructor called");
    }

    void show() {
        super.show();
        System.out.println("Type: " + type);
    }
}

public class Q14_SuperKeyword {
    public static void main(String[] args) {
        Car c = new Car();
        c.show();
    }
}
