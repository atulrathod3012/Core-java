package Collection.Queue;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {
    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.add("One");
        q.add("Two");
        q.add("Three");

        System.out.println("Queue: " + q);

        System.out.println("Peek: " + q.peek());
        System.out.println("Poll: " + q.poll());   // removes head

        System.out.println("After poll: " + q);

        q.offer("Four");
        q.offer("Five");

        System.out.println("After offer: " + q);

        System.out.println("\nTraversing:");
        for (String s : q) {
            System.out.println(s);
        }

        q.clear();
        System.out.println("\nAfter clear: " + q);
    }
}
