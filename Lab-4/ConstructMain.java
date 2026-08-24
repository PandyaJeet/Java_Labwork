import java.util.Scanner;

class Construct{
    String name;
    int pubYear;
    Construct(){
        name = "Harry Potter";
        pubYear= 1990;
    }
    Construct(String name,int pubYear){
        this.name=name;
        this.pubYear=pubYear;
    }
    public void display(){
        System.out.println("Book name : " + name);
        System.out.println("Publication Year : " + pubYear);
    }
}
class ConstructMain {
    public static void main(String[] args) {
        Construct obj = new Construct();
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Book name : ");
        String name = n.nextLine();
        System.out.print("Enter Publication Year : ");
        int year= n.nextInt();
        Construct obj1 = new Construct(name,year);
        obj.display();
        obj1.display();
    }
}
