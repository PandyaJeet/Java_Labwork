import java.util.LinkedHashMap;

public class Q19_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> countries = new LinkedHashMap<>();
        countries.put("India", "New Delhi");
        countries.put("Japan", "Tokyo");
        countries.put("France", "Paris");

        for (var entry : countries.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
