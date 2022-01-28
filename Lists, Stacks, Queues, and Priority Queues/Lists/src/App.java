/*
* List interface extends the Collection interface and defines a collection for storing elements in a sequential order.
* List is created using two concrete classes : ArrayList or LinkedList.
* ArrayList offers better performance when we want random access through an index without inserting or removing elements
    at the beginning of the list.
*  LinkedList offers better performance if we want to to perform insertion or deletion of elements at the beginning of the list.
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

public class App {
}
