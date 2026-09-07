class Super{
    int h = 10;
   public void hello(){
        System.out.println("Hello, World");
   }
}
class Sub extends Super{
    public void hello(){
        System.out.println("Not Hello");
    }
    public void call(){
        int h=100;
        System.out.println(h);
        System.out.println(super.h);
        hello();
        super.hello();
    }
}
class SuperMain{
    public static void main(String[] args) {
        Sub n = new Sub();
        n.call();
    }    
}
