
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running fast");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running smoothly");
    }
}

public class Q15_MethodOverriding {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Bike b = new Bike();
        Car c = new Car();

        v.run();
        b.run();
        c.run();
    }
}
