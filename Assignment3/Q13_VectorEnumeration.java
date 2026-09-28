import java.util.Enumeration;
import java.util.Vector;

public class Q13_VectorEnumeration {
    public static void main(String[] args) {
        Vector<String> books = new Vector<>();
        books.add("Java Basics");
        books.add("Data Structures");
        books.add("Operating Systems");

        Enumeration<String> titles = books.elements();
        while (titles.hasMoreElements()) {
            System.out.println(titles.nextElement());
        }
    }
}
