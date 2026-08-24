
final class Vehicle {   // final class cannot be extended by any other class
    void show() {
        System.out.println("This is a final class");
    }
}

// class SportsCar extends Vehicle {}   // Error: cannot inherit from final class Vehicle

class Demo {
    final int SPEED_LIMIT = 120;   // final variable, value cannot change after initialization

    void showLimit() {
        // SPEED_LIMIT = 150;   // Error: cannot assign a value to final variable SPEED_LIMIT
        System.out.println("Speed Limit: " + SPEED_LIMIT);
    }
}

public class Q7_FinalKeyword {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.show();

        Demo d = new Demo();
        d.showLimit();
    }
}
