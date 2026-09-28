class PriorityTask extends Thread {
    PriorityTask(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        for (int count = 1; count <= 3; count++) {
            System.out.println(getName() + " priority " + getPriority());
        }
    }
}

public class Q8_ThreadPriorities {
    public static void main(String[] args) throws InterruptedException {
        Thread low = new PriorityTask("Low", Thread.MIN_PRIORITY);
        Thread normal = new PriorityTask("Normal", Thread.NORM_PRIORITY);
        Thread high = new PriorityTask("High", Thread.MAX_PRIORITY);

        low.start();
        normal.start();
        high.start();
        low.join();
        normal.join();
        high.join();
        System.out.println("Priority is only a scheduling hint; order may vary.");
    }
}
