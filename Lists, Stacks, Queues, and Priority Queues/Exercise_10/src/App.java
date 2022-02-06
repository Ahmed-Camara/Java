import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        PriorityQueue<String> q1 = new PriorityQueue<>();
        q1.offer("George");
        q1.offer("Jim");
        q1.offer("John");
        q1.offer("Blake");
        q1.offer("Kevin");
        q1.offer("Michael");

        PriorityQueue<String> q2 = new PriorityQueue<>();
        q2.offer("George");
        q2.offer("Katie");
        q2.offer("Kevin");
        q2.offer("Michelle");
        q2.offer("Ryan");

        // Intersection
        q2.retainAll(q1);
        System.out.println("Intersection : " + q2);

        // Union
        q2.addAll(q1);
        System.out.println("Union: " + q2);

        // Difference
        PriorityQueue<String> d = new PriorityQueue<>();
        q2.removeAll(q1);
        d.addAll(q2);
        q2 = new PriorityQueue<>(q2);
        q1.removeAll(q2);
        d.addAll(q1);
        System.out.println("Difference: " + d);
    }
}
