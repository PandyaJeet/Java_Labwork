class Rectangle{
    Rectangle(int h, int l){
        System.out.println("Area of Rectangle : " + h*l);
    }
    Rectangle(String s){
        System.out.println("Not a valid value");
    }
}
class RectangleMain {
    public static void main(String args[]){
    Rectangle r = new Rectangle(10,20);
    Rectangle r1 = new Rectangle("Hello");
    }
}
