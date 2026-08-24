class Static{
    static int a=10;
    static void display(){
        System.out.println(++a);
    }
}
class StaticMain {
    public static void main(String[] args) {
        Static.display(); 
    }
}
