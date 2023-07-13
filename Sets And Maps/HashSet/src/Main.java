import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		//1.
		
		Set<String> set = new HashSet<>();
		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Franscisco");
		set.add("New York");
		
		System.out.println(set);
		
		for(String s : set) {
			System.out.print(s.toUpperCase()+" ");
		}
		
		System.out.println();
		
		Iterator<String> iters = set.iterator();
		
		while(iters.hasNext()) {
			System.out.print(iters.next().toUpperCase()+" ");
		}
		System.out.println();
		
		//2.
		
		
		Set<String> set1 = new HashSet<>();
		
		set1.add("London");
		set1.add("Paris");
		set1.add("New York");
		set1.add("San Franscisco");
		set1.add("Beijing");
		
		System.out.println("Set1 : "+set1);
		
		Set<String> set2 = new HashSet<>();
		
		set2.add("London");
		set2.add("Shanghai");
		set2.add("Paris");
		
		System.out.println("set2 : "+set2);
		
		System.out.println(set2.size()+" elements in set2");
		
		
		System.out.println("\nIs Taipei in set2 ? "+set2.contains("Taipei"));
		
		
		set1.addAll(set2);
		
		System.out.println("\nAfter adding set2 to set1, set1 is "+set1);
		
		
		set1.removeAll(set2);
		
		System.out.println("\nAfter removing set2 to set1, set1 is "+set1);
		
		set1.retainAll(set2);
		
		System.out.println("\nAfter removing common elements in set2 from set1, set1 is "+set1);
	}

}
