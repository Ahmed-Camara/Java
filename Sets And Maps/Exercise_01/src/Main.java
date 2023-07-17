import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<String> set1 = new LinkedHashSet<>(Arrays.asList(
				"George", "Jim", "John", "Blake", "Kevin", "Michael"));
			Set<String> set2 = new LinkedHashSet<>(Arrays.asList(
				"George", "Katie", "Kevin", "Michelle", "Ryan"));
			
			//1. Find their union
			Set<String> unionSet = new LinkedHashSet<>(set1);
			unionSet.addAll(set2);
			System.out.println(unionSet);
			
			//2. Find their difference
			Set<String> diffSet = new LinkedHashSet<>(set1);
			diffSet.removeAll(set2);
			System.out.println(diffSet);
			
			//3. Find the intersection
			Set<String> interSet = new LinkedHashSet<>(set1);
			interSet.retainAll(set2);
			System.out.println(interSet);
	}

}
