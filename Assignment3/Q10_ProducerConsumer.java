import java.util.ArrayList;
import java.util.Random;

public class Q10_ProducerConsumer {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        Thread producer = new Thread(() -> {
            for (int count = 1; count <= 5; count++) {
                numbers.add(random.nextInt(100));
            }
        });
        Thread consumer = new Thread(() -> {
            for (int number : numbers) {
                System.out.println("Consumed : " + number);
            }
        });

        producer.start();
        producer.join();
        consumer.start();
        consumer.join();
    }
}
