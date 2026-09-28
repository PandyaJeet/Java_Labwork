class NumberTask implements Runnable {
    public void run() {
        for (int number = 1; number <= 10; number++) {
            System.out.println("Number : " + number);
        }
    }
}

public class Q7_RunnableThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread numberThread = new Thread(new NumberTask());
        numberThread.start();

        for (char letter = 'A'; letter <= 'J'; letter++) {
            System.out.println("Alphabet : " + letter);
        }
        numberThread.join();
    }
}
