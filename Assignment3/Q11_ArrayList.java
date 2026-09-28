import java.util.ArrayList;

public class Q11_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Bhavna");
        names.add("Chirag");
        names.remove("Bhavna");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
