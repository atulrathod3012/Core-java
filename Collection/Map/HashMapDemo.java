package Collection.Map;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        map.put(2, "Updated Banana");   // overwrite value

        System.out.println("HashMap: " + map);

        System.out.println("Value of key 1: " + map.get(1));

        map.remove(3);
        System.out.println("After removing key 3: " + map);

        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value Mango? " + map.containsValue("Mango"));

        System.out.println("Size: " + map.size());

        System.out.println("\nTraversing using for-each:");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        map.clear();
        System.out.println("\nAfter clear: " + map);
    }
}

