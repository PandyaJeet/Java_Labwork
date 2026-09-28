import java.util.LinkedList;

public class Q12_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(30);
        numbers.addFirst(5);
        numbers.add(1, 20);
        numbers.remove(Integer.valueOf(30));
        System.out.println(numbers);
    }
}
