import java.util.TreeMap;

public class Q20_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> products = new TreeMap<>();
        products.put("Keyboard", 1200.0);
        products.put("Monitor", 8500.0);
        products.put("Mouse", 600.0);

        for (var entry : products.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
