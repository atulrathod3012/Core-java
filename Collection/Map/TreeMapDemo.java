package Collection.Map;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");

        System.out.println("TreeMap (Sorted by key): " + map);

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        System.out.println("Value of key 20: " + map.get(20));

        map.remove(30);
        System.out.println("After removing key 30: " + map);

        System.out.println("\nTraversing:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        map.clear();
        System.out.println("\nAfter clear: " + map);
    }
}
