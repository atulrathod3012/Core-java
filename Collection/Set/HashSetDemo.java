package Collection.Set;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple");   // duplicate (ignored)

        System.out.println("HashSet: " + set);

        System.out.println("Contains Mango? " + set.contains("Mango"));

        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        System.out.println("Size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());

        System.out.println("\nUsing for-each:");
        for (String s : set) {
            System.out.println(s);
        }

        set.clear();
        System.out.println("\nAfter clear: " + set);
    }
}

