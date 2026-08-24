
interface Movable {
    void move();
}

interface Stoppable {
    void stop();
}

class Car implements Movable, Stoppable {
    public void move() {
        System.out.println("Car is moving");
    }

    public void stop() {
        System.out.println("Car has stopped");
    }
}

public class Q21_MultipleInterfaces {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
        c.stop();
    }
}
