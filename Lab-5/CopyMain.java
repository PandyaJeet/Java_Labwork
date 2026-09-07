import java.util.*;
class Copy{
    String name;
    Copy(Copy h){
        this.name = h.name;
    }
    Copy(String n){
        name = n;
    }
    public void disp(){
        System.out.println("Name : "+ name);
    }
}
class CopyMain{
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String o = n.nextLine();
        Copy obj1 = new Copy(o);
        obj1.disp();
        System.out.println("=======COPY CONSTRUCT======");
        Copy obj2 = new Copy(obj1);
        obj2.disp();
    }
}
