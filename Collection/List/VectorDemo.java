package Collection.List;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        // adding elements
        v.add("A");
        v.add("B");
        v.add("C");
        v.add(1, "Inserted");

        System.out.println("Vector: " + v);

        // accessing
        System.out.println("Element at index 2: " + v.get(2));

        // updating
        v.set(0, "Updated");
        System.out.println("After set: " + v);

        // removing
        v.remove("B");
        v.remove(1);
        System.out.println("After remove: " + v);

        // basic info
        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Contains C? " + v.contains("C"));
        System.out.println("Is empty? " + v.isEmpty());

        // addAll demo
        Vector<String> v2 = new Vector<>();
        v2.add("X");
        v2.add("Y");

        v.addAll(v2);
        System.out.println("After addAll: " + v);

        // for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        // foreach
        System.out.println("\nUsing for-each:");
        for (String s : v) {
            System.out.println(s);
        }

        // iterator
        System.out.println("\nUsing iterator:");
        Iterator<String> it = v.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // clear
        v.clear();
        System.out.println("\nAfter clear: " + v);
    }
}
