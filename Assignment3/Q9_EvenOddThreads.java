class EvenTask extends Thread {
    public void run() {
        for (int number = 2; number <= 20; number += 2) {
            System.out.println("Even : " + number);
        }
    }
}

class OddTask extends Thread {
    public void run() {
        for (int number = 1; number <= 19; number += 2) {
            System.out.println("Odd : " + number);
        }
    }
}

public class Q9_EvenOddThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread even = new EvenTask();
        Thread odd = new OddTask();
        even.start();
        odd.start();
        even.join();
        odd.join();
    }
}
