import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("London");
		set.add("Paris");
		set.add("New York");
		set.add("San Franscisco");
		set.add("Beijing");
		set.add("New York");
		
		System.out.println(set);
	}

}
