class Vehicle{
    void run(){
        System.out.println("Vehicle is running...");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running...");
    }
}
class Car extends Vehicle{
    void run(){
        System.out.println("Car is running...");
    }
}
class Override{
    public static void main(String args[]){
        Vehicle a = new Vehicle();
        Vehicle b = new Bike();
        Vehicle c = new Car();
        a.run();
        b.run();
        c.run();
    }
}