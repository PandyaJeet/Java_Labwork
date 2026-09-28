class Hello extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
class Hi extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
        }
    }
}
class ThreadMain{
    public static void main(String[] args) {
        Hello h = new Hello();
        Hi o = new Hi();
        o.start();
        h.start();
    }
}