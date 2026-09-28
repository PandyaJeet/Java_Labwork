class Hello implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
class Hi implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
        }
    }
}
class RunnableMain{
    public static void main(String[] args) {
        Hello h = new Hello();
        Hi o = new Hi();
        Thread t1 = new Thread(h);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();
    }
}