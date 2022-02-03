/*
* In priority Queue the element with the highest priority is removed first.
* Queue is a FIFO data structure which means element are added at the end, and remove at the beginning.
    + offer(element: E) : boolean => add element to the queue.
    + poll() : E => retrieves and removes element from the queue, return null if queue empty.
    + remove() : E => retrieves and removes element from the queue, throw exception if queue empty.
    + peek() : E => retrieves but do not remove the head of the queue, return null if queue empty.
    + element() : E => retrieves but does not remove the head of the queue, throw exception if queue empty.

* LinkedList is efficient to implement queue, elements are stored and retrieved efficiently from both ends of list.
* LinkedList implements Deque interface, which extends Queue interface.
* Deque supports insertion and removal at both ends.
* Deque has additional methods : addFirst(e),removeFirst(),addLast(e),removeLast(),getFirst() and getLast()
* */
import java.util.LinkedList;
import java.util.Queue;
public class App {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Abidjan");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");
        displayQueue(queue);
    }

    public static void displayQueue(Queue<String> queue){
        while (queue.size() > 0){
            System.out.print(queue.poll()+" ");
        }
    }
}
