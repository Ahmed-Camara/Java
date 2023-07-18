import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Enter a number : ");
			int num = input.nextInt();
			
			if(num == 0) {
				break;
			}else {
				list.add(num);
			}
			System.out.println();
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			if(!map.containsKey(num)) {
				map.put(num, 1);
			}else {
				int value = map.get(num);
				value++;
				map.put(num, value);
			}
		}
		
		int max = Collections.max(map.values());
		
		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		
		System.out.print("The most occuring elements are : ");
		for(Map.Entry<Integer, Integer> entry : entrySet) {
			
			if(entry.getValue() == max) {
				System.out.print(entry.getKey()+" ");
			}
		}
			
	}

}
