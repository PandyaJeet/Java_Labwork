class RunningThread extends Thread {
    public void run() {
        for (int count = 1; count <= 5; count++) {
            System.out.println("Running Thread");
        }
    }
}

public class Q6_ExtendsThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new RunningThread();
        thread.start();
        thread.join();
    }
}
