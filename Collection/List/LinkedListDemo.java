package Collection;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class LinkedListMethodsDemo {

    public static void main(String[] args) {

        // ---------------------------------------------------
        // 1. Create LinkedList
        // ---------------------------------------------------
        LinkedList<Object> list = new LinkedList<>();

        // ---------------------------------------------------
        // 2. Add elements
        // ---------------------------------------------------
        list.add(10);
        list.add("Atul");
        list.add(20.5);
        list.add(true);

        // Add element at specific index
        list.add(2, "Inserted");

        System.out.println("Initial List: " + list);

        // ---------------------------------------------------
        // 3. Add First / Add Last
        // ---------------------------------------------------
        list.addFirst("Start");
        list.addLast("End");
        System.out.println("After addFirst & addLast: " + list);

        // ---------------------------------------------------
        // 4. Access elements
        // ---------------------------------------------------
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // ---------------------------------------------------
        // 5. Modify element
        // ---------------------------------------------------
        list.set(1, "Rathod");
        System.out.println("After set(): " + list);

        // ---------------------------------------------------
        // 6. Remove elements
        // ---------------------------------------------------
        list.remove(2);               // remove by index
        list.remove("Atul");          // remove by value
        System.out.println("After remove(): " + list);

        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst & removeLast: " + list);

        // ---------------------------------------------------
        // 7. Contains / Size / isEmpty
        // ---------------------------------------------------
        System.out.println("Contains 10? " + list.contains(10));
        System.out.println("Size: " + list.size());
        System.out.println("Is Empty? " + list.isEmpty());

        // ---------------------------------------------------
        // 8. AddAll
        // ---------------------------------------------------
        LinkedList<Object> anotherList = new LinkedList<>();
        anotherList.add("A");
        anotherList.add("B");

        list.addAll(anotherList);
        System.out.println("After addAll(): " + list);

        list.addAll(1, anotherList);
        System.out.println("After addAll(index): " + list);

        // ---------------------------------------------------
        // 9. Sorting (Only same-type LinkedList)
        // ---------------------------------------------------
        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(5);
        numList.add(1);
        numList.add(3);
        numList.add(2);

        System.out.println("\nBefore Sorting: " + numList);
        Collections.sort(numList);
        System.out.println("After Sorting: " + numList);

        // ---------------------------------------------------
        // 10. Peek / Poll (Queue-like operations)
        // ---------------------------------------------------
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");

        System.out.println("\nPeek: " + queue.peek());   // returns first, does NOT remove
        System.out.println("Poll: " + queue.poll());     // returns first, removes it
        System.out.println("After poll(): " + queue);

        // ---------------------------------------------------
        // 11. Iterating
        // ---------------------------------------------------
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

        // ---------------------------------------------------
        // 12. Clear list
        // ---------------------------------------------------
        list.clear();
        System.out.println("\nAfter clear(): " + list);
        System.out.println("Is Empty Now? " + list.isEmpty());
    }
}
