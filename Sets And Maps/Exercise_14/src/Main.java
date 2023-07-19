import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		crawler(url); 
	}

	public static void crawler(String startingURL) {
		Set<String> listOfPendingURLs = new LinkedHashSet<>();
		Set<String> listOfTraversedURLs = new HashSet<>();
		Set<String> subURLs = new HashSet<>();

		listOfPendingURLs.add(startingURL);
		while (!listOfPendingURLs.isEmpty() && 
			listOfTraversedURLs.size() <= 100) {
			for (String urlString: listOfPendingURLs) {
				System.out.println("Craw " + urlString);
				subURLs.addAll(getSubURLs(urlString));
			} 
			listOfTraversedURLs.addAll(listOfPendingURLs);
			subURLs.removeAll(listOfTraversedURLs);
			listOfPendingURLs.addAll(subURLs);
		}
	}

	public static Set<String> getSubURLs(String urlString) {
		Set<String> set = new LinkedHashSet<>();

		try {
			java.net.URL url = new java.net.URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			while (input.hasNext()) {
				String line = input.nextLine();
				current = line.indexOf("http:", current);
				while (current > 0) {
					int endIndex = line.indexOf("\"", current);
					if (endIndex > 0) {
						set.add(line.substring(current, endIndex));
						current = line.indexOf("http:", endIndex);
					}
					else
						current = -1;
				}
			}
		}
		catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		return set;
	}
}
