class Vehicle{
    public void run(){
        System.out.println("Vehicle is running...");
    }
}
class Bike extends Vehicle{
    public void run(){
        System.out.println("Bike is running...");
    }
}
class Car extends Vehicle{
    public void run(){
        System.out.println("Car is running...");
    }
}
class OverrideMain{
    public static void main(String args[]){
        Bike b = new Bike();
        Car c = new Car();
        b.run();
        c.run();
    }
}