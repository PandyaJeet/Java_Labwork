interface Movable{
    void move();
}
interface Stoppable{
    void stop();
}
class Car implements Movable, Stoppable{
    public void move(){
        System.out.println("Car is moving..");
    }
    public void stop(){
        System.out.println("Car stopped moving..");
    }
}
class Vehicle{
    public static void main(String[] args) {
        Car n = new Car();
        n.move();
        n.stop();
    }
}