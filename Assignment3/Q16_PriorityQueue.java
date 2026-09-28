import java.util.PriorityQueue;

public class Q16_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> tasks = new PriorityQueue<>();
        tasks.add(40);
        tasks.add(10);
        tasks.add(30);
        tasks.add(20);

        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }
    }
}
