import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		
		String text = "Good morning. Have a good class. Have a good visit. Have fun!";
		
		Map<String,Integer> map = new TreeMap<>();
		
		String []words = text.split("[ \n\t\r.,;:!?(){]");
		
		for(int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			
			if(key.length() > 0) {
				if(!map.containsKey(key)) {
					map.put(key,1);
				}else {
					
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		
		ArrayList<WordOccurrence> list = new ArrayList<>();
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<String, Integer> entry : entrySet)
			list.add(new WordOccurrence(entry.getKey(), entry.getValue()));
		
		Collections.sort(list);
		
		for(WordOccurrence o : list) {
			System.out.println(o.getWords()+" = "+o.getCount());
		}
	}
}


class WordOccurrence implements Comparable{
	
	String words;
	int count;
	
	public String getWords() {
		return words;
	}
	
	public int getCount() {
		return count;
	}
	public WordOccurrence(String words, int count) {
		this.words = words;
		this.count = count;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}