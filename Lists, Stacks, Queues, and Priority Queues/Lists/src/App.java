/*
* List interface extends the Collection interface and defines a collection for storing elements in a sequential order.
* List is created using two concrete classes : ArrayList or LinkedList.
* ArrayList offers better performance when we want random access through an index without inserting or removing elements
    at the beginning of the list.
*  LinkedList offers better performance if we want to perform insertion or deletion of elements at the beginning of the list.
* If we do not require insertion or deletion of elements then, an array is the most efficient data structure.
* The listIterator() listIterator(startIndex) method returns an instance of ListIterator which extends the Iterator interface
    to add bidirectional traversal of the list.
    - Methods in the ListIterator interface :
        . add(element : E) : void => add the specified object to the list.
        . hasPrevious(): boolean => check whether a list iterator has more elements when traversing backward.
        . nextIndex() : int => returns index of the next elements
        . previous() : E => returns previous element in the list iterator.
        . previousIndex() : int => returns index of previous element.
        . set(element : E) : void => replace last element returned by the previous or next method with the specified element.
* */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0,10);
        arrayList.add(3,30);

        System.out.println("List of integers : ");
        System.out.println(arrayList);

        LinkedList<Object> linkedList = new LinkedList<>(arrayList);

        linkedList.add(1,"red");
        linkedList.removeLast();
        linkedList.addFirst("Green");

        System.out.println("Display the linked list forward : ");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }

        System.out.println();

        System.out.println("Display the linked list backward : ");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+" ");
        }
        System.out.println();
    }
}
