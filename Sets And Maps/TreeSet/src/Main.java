import java.util.*;

public class Main {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Franscisco");
		set.add("Beijing");
		set.add("New York");
		
		TreeSet<String> treeSet = new TreeSet<>(set);
		
		System.out.println("Sorted tree set : "+treeSet);
		System.out.println("first() : "+treeSet.first());
		System.out.println("last() : "+treeSet.last());
		System.out.println("treeSet.headSet(\"New York\") : "+
				treeSet.headSet("New York"));
		System.out.println("treeSet.tailSet(\"New York\") : "+treeSet.tailSet("New York"));
		
		// Use  the methods in navigableSet interface
		System.out.println("treeSet.lower(\"p\") : "+treeSet.lower("P"));
		System.out.println("treeSet.higher(\"p\") : "+treeSet.higher("P"));
		System.out.println("treeSet.floor(\"p\") : "+treeSet.floor("P"));
		System.out.println("treeSet.ceiling(\"p\") : "+treeSet.ceiling("P"));
		System.out.println("treeSet.pollFirst() : "+treeSet.pollFirst());
		System.out.println("treeSet.pollLast() : "+treeSet.pollLast());
		System.out.println("New tree set : "+treeSet);
	}

}
