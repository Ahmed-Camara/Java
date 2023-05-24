import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int len = 0;
		int[]arr = new int[100];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			int num = input.nextInt();
			if(num < 0) {
				break;
			}else {
				arr[i] = num;
				sum+= arr[i];
				len++;
			}
		}
		
		double average = sum / len;
		
		int countAboveAvg = 0;
		int countBelowAvg = 0;
		
		
		for(int i = 0; i < len; i++) {
			
			if(arr[i] > average) {
				countAboveAvg++;
			}else {
				
				countBelowAvg++;
			}
		}
		
		
		System.out.println();
		
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("The number of numbers above average "+average+" is : "+countAboveAvg);
		System.out.println("The number of numbers below average "+average+" is : "+countBelowAvg);
		

	}

}
