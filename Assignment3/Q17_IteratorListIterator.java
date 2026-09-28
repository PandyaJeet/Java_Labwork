import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Q17_IteratorListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator : " + iterator.next());
        }

        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Forward : " + listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            System.out.println("Backward : " + listIterator.previous());
        }
    }
}
