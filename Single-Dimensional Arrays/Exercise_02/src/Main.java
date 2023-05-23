import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int len = 10;
		int []arr = new int[len];
		for(int i = 0 ; i < len; i++) {
			arr[i] = input.nextInt();
		}
		
		System.out.println("Original array : ");
		for(int n : arr) {
			System.out.print(n+ " ");
		}
		System.out.println();
		System.out.println("Reversed order array");
		for(int i = len-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
