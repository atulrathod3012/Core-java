package Collection.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Dog");
        set.add("Cat");
        set.add("Horse");
        set.add("Dog");     // duplicate not allowed

        System.out.println("LinkedHashSet: " + set);

        System.out.println("Contains Cat? " + set.contains("Cat"));

        set.remove("Horse");
        System.out.println("After removing Horse: " + set);

        System.out.println("Size: " + set.size());

        System.out.println("\nTraversing:");
        for (String s : set) {
            System.out.println(s);
        }

        set.clear();
        System.out.println("\nAfter clear: " + set);
    }
}
