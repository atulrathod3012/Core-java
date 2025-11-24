package Collection.Queue;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);  // auto-sorted

        System.out.println("Peek (head): " + pq.peek());  // smallest element

        pq.poll();   // removes smallest
        System.out.println("After poll: " + pq);

        System.out.println("Contains 30? " + pq.contains(30));

        System.out.println("\nUsing for-each:");
        for (int n : pq) {
            System.out.println(n);
        }

        pq.clear();
        System.out.println("\nAfter clear: " + pq);
    }
}
