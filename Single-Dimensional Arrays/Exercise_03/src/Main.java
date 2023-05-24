import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100: ");
        int len = 0;
        
        // Read numbers from input and store them in the array
        for (int i = 0; i < 100; i++) {
            int num = input.nextInt();

            if (num <= 0)
                break;
            else {
                len++;
                arr[i] = num;
            }
        }

        int[] arrs = Arrays.copyOf(arr, len);

        System.out.println("\nArray contents: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arrs[i] + " ");
        }

        Arrays.sort(arrs);

        System.out.println("\nSorted array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arrs[i] + " ");
        }

        System.out.println("\nOccurrences: ");
        int count = 1;
        for (int i = 0; i < len; i++) {
            if (i > 0 && arrs[i] == arrs[i - 1]) {
                count++;
            } else {
                if (i > 0) {
                    System.out.println(arrs[i - 1] + " occurs " + count + " times");
                }
                count = 1;
            }
        }
        
        // Check the last element separately
        if (len > 0) {
            System.out.println(arrs[len - 1] + " occurs " + count + " times");
        }
	}

}
