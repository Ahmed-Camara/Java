import java.util.ArrayList;
import java.util.Collection;

public class App {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New york");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Abidjan");
        collection1.add("Madison");

        System.out.println("A list of cities in collection1 : ");
        System.out.println(collection1);

        System.out.println("Is Dallas in the collection1 ? "+collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.println();
        System.out.println(collection1.size()+" cities are in collection1 now");


        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Bouake");
        collection2.add("Atlanta");
        collection2.add("Odienne");

        System.out.println();
        System.out.println("List of cities in collection2 : ");
        System.out.println(collection2);

        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println();
        System.out.println("Cities in collection 1 or collection 2 : ");
        System.out.println(c1);


        c1 = (ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println();
        System.out.println("Cities in collection 1 and collection 2 : ");
        System.out.println(c1);


        c1 = (ArrayList<String>) (collection1.clone());
        c1.removeAll(collection2);

        System.out.println();
        System.out.println("Cities in collection 1, but not in collection 2 : ");
        System.out.println(c1);
    }
}
