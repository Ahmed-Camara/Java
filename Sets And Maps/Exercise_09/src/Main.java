import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Cote d'Ivoire", "Abidjan");
		map.put("Burkina", "Ouagadougou");
		map.put("Benin", "Cotonou");
		map.put("Ghana", "Accra");
		map.put("Mali", "Bamako");
		map.put("Liberia", "Monrovia");
		map.put("Guinee", "Conakry");
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a state : ");
		String state = input.nextLine();
		
		if(state.length() > 0) {
			System.out.println("The Capital city "+state+" is "+map.get(state));
		}else {
			System.out.println("Please enter a valid state");
		}
	}

}
