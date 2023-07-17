import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception{
		Set<Character> set = new HashSet<>(Arrays.asList('A','E','I','O','U'));
		
		int vowels = 0;
		int consonants = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a file path : ");
		String path = in.nextLine();
		
		File file = new File(path);
		
		if(file.exists()) {
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				String lines = input.nextLine();
				
				for(int i = 0; i < lines.length(); i++) {
					
					if(set.contains(Character.toUpperCase(lines.charAt(i)))) {
						vowels++;
					}else if (Character.isLetter(lines.charAt(i))) {
						consonants++;
					}
				}
			}
			
			System.out.println("The file located at "+path+" contains "+vowels+" vowels, and "+consonants+" consonants.");
		}else {
			System.out.println("File located in "+path+" does not exists");
		}
	}

}
