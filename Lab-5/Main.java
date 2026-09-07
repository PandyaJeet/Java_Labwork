import java.util.Scanner;

class Shape{
    int r,l,h;
}
class Circle extends Shape{
    public void set (int r){
        this.r=r;
    }
    public void display(){
        System.out.println("Area of Circle is " + r*r);
    }
}
class Rect extends Shape{
    public void set (int h, int l){
        this.h=h;
        this.l=l;
    }
    public void display(){
        System.out.println("Area of Rectangle is " + h*l);
    }
}
class Main{
    public static void main(String[] args) {
        Scanner n = new Scanner (System.in);
        System.out.print("Enter radius : ");
        int r = n.nextInt();
        System.out.print("Enter height : ");
        int h = n.nextInt();
        System.out.print("Enter width : ");
        int l = n.nextInt();
        Rect r1 = new Rect();
        Circle c = new Circle();
        r1.set(h, l);
        c.set(r);
        r1.display();
        c.display();
    }
}
