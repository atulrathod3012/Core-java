package Collection.Map;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        System.out.println("LinkedHashMap: " + map);  // maintains insertion order

        System.out.println("Value of B: " + map.get("B"));

        map.remove("C");
        System.out.println("After removing C: " + map);

        map.put("D", 40);

        System.out.println("\nTraversing:");
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        map.clear();
        System.out.println("\nAfter clear: " + map);
    }
}
