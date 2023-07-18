import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args)throws Exception {
		
		File file = new File(args[0]);
		if(file.exists()) {
			
			Map<String, Integer> map = new TreeMap<>();
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				String[] words = input.nextLine().split("[ \n\t\r\"\'.,;:!?()]");
				
				for(String word : words) {
					String w = word.toLowerCase();
					
					if(w.length() > 0 && Character.isLetter(w.charAt(0))) {
						
						if(!map.containsKey(w)) {
							map.put(w, 1);
						}else {
							int value = map.get(w);
							value = value + 1;
							map.put(w, value);
						}
						
					}
					
				}
				
				
			}
			
			// Display the contents of map
			Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
						
			for(Map.Entry<String, Integer> entry : entrySet)
				System.out.println(entry.getKey()+"\t"+entry.getValue());
			
		}else {
			System.out.println("Specify the location of the file");
		}
	}

}
