/*
* Each collection is Iterable, we can obtain its Iterator object to traverse all the elements in the collection.
* Iterator allows to traverse a data structure without having to expose the details of how data is stored in the data structure.
* The Collection interface extends the Iterable interface which defines the iterator() method, which returns an iterator.
* The iterable interface returns an instance of Iterator which provides access to the next() method to access elements
    in the collection, the hasNext() method to check whether there are more elements in the iterator,
    and the remove() method to remove the last element returned by the iterator.
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
         collection.add("Madison");

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next().toUpperCase()+" ");
        }
        System.out.println();

        //We can also traverse a collection without using an iterator, we can only use a foreach loop:

        for(String element : collection){
            System.out.print(element.toUpperCase()+" ");
        }
    }
}
