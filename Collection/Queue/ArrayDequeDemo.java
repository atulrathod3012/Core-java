package Collection.Queue;
import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<String> dq = new ArrayDeque<>();

        dq.add("A");
        dq.add("B");
        dq.add("C");

        dq.addFirst("Start");
        dq.addLast("End");

        System.out.println("ArrayDeque: " + dq);

        System.out.println("First: " + dq.peekFirst());
        System.out.println("Last: " + dq.peekLast());

        dq.removeFirst();
        dq.removeLast();
        System.out.println("After removing ends: " + dq);

        dq.offer("D");
        dq.offerFirst("X");

        System.out.println("\nQueue again: " + dq);

        System.out.println("\nTraversing:");
        for (String s : dq) {
            System.out.println(s);
        }

        dq.clear();
        System.out.println("\nAfter clear: " + dq);
    }
}
