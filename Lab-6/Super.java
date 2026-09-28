import java.util.*;
class  Base{
    int a;
    void setData(int a){
        this.a = a;
    }
    Base(){
        System.out.println("This is base class constructor");
    }
    void putData(){
        System.out.println("Base Class : A = " + a);
    }
}
class Derived extends Base{
    int b;
    Derived(){
        super();
        System.out.println("This is dervied class constructor");
    }
    void setData(int b,int a){
        super.setData(a);;
        this.b=b;
    }
    void putData(){
        super.putData();
        System.out.println("Derive Class : B = " + b);
    }
}
class Super{
    public static void main(String args[]){
        Derived obj = new Derived();
        Scanner n = new Scanner(System.in);
        System.out.println("Enter data for a : ");
        int a = n.nextInt();
        System.out.println("Enter data for b : ");
        int b = n.nextInt();
        obj.setData(a,b);
        obj.putData();
    }
}