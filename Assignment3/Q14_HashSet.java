import java.util.HashSet;

public class Q14_HashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        System.out.println(cities);
    }
}
