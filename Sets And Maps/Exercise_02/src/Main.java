import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;


/*
 * (Display nonduplicate words in ascending order) Write a program that reads 
	words from a text file and displays all the nonduplicate words in ascending order. 
	The text file is passed as a command-line argument.
 * */
public class Main {

	public static void main(String[] args) throws Exception{
		
		File file = new File(args[0]);
		if(file.exists()) {
			
			TreeSet<String> treeSet = new TreeSet<>();
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				String[] words = input.nextLine().split("[ \n\t\r.,;:!?()-]");
				
				for(String word : words) {
					if(word.length() > 0) {
						treeSet.add(word.toLowerCase());
					}
				}
			}
			
			System.out.println(treeSet);
		}else {
			System.out.println("File "+file+" does not exists");
		}
	}

}
