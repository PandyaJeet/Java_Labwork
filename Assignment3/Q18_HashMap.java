import java.util.HashMap;

public class Q18_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Aman");
        students.put(102, "Bhavna");
        students.put(103, "Chirag");

        for (var entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
