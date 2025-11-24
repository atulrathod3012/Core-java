package Collection.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);   // duplicate ignored

        System.out.println("TreeSet (Sorted): " + set);

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        System.out.println("Contains 20? " + set.contains(20));

        set.remove(30);
        System.out.println("After removing 30: " + set);

        System.out.println("\nUsing for-each:");
        for (int n : set) {
            System.out.println(n);
        }

        set.clear();
        System.out.println("\nAfter clear: " + set);
    }
}
