package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListMethodDemo {
    public static void main(String[] args) {
      // ---------------------------
        // 1. Create ArrayList
        // ---------------------------
        ArrayList<Object> list = new ArrayList<>();

        // ---------------------------
        // 2. Add elements
        // ---------------------------
        list.add(10);
        list.add("Atul");
        list.add(20.5);
        list.add(true);

        // Add element at specific index
        list.add(2, "Inserted");

        System.out.println("Initial List: " + list);

        // ---------------------------
        // 3. Access elements
        // ---------------------------
        System.out.println("Element at index 1: " + list.get(1));

        // ---------------------------
        // 4. Modify an element
        // ---------------------------
        list.set(1, "Rathod");
        System.out.println("After set(): " + list);

        // ---------------------------
        // 5. Remove elements
        // ---------------------------
        list.remove(2);                // remove by index
        list.remove("Atul");           // remove by value (if exists)
        System.out.println("After remove(): " + list);

        // ---------------------------
        // 6. Check methods
        // ---------------------------
        System.out.println("Contains 10? " + list.contains(10));
        System.out.println("Is Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());

        // ---------------------------
        // 7. Add all elements
        // ---------------------------
        ArrayList<Object> anotherList = new ArrayList<>();
        anotherList.add("A");
        anotherList.add("B");

        list.addAll(anotherList);
        System.out.println("After addAll(): " + list);

        // AddAll at index
        list.addAll(1, anotherList);
        System.out.println("After addAll(index): " + list);

        // ---------------------------
        // 8. Sorting (Only works with same-type list)
        // ---------------------------
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(1);
        numList.add(3);
        numList.add(2);

        System.out.println("\nBefore Sorting: " + numList);
        Collections.sort(numList);
        System.out.println("After Sorting: " + numList);

        // ---------------------------
        // 9. Cloning ArrayList
        // ---------------------------
        ArrayList<Object> cloneList = (ArrayList<Object>) list.clone();
        System.out.println("\nCloned List: " + cloneList);

        // ---------------------------
        // 10. SubList
        // ---------------------------
        System.out.println("SubList(1,3): " + list.subList(1, 3));

        // ---------------------------
        // 11. Iterating
        // ---------------------------
        System.out.println("\nUsing For Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\nUsing For-Each:");
        for (Object obj : list) {
            System.out.println(obj);
        }

        System.out.println("\nUsing Iterator:");
        Iterator<Object> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // ---------------------------
        // 12. Clear list
        // ---------------------------
        list.clear();
        System.out.println("\nAfter clear(): " + list);
        System.out.println("Is Empty? " + list.isEmpty());
    }
}
