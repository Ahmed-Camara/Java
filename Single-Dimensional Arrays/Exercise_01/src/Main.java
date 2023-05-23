import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		int nbreStudents = input.nextInt();
		
		int[]arr = new int[nbreStudents];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		
		int bestScore = -1;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > bestScore) {
				bestScore = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println("Student "+i+" score "+arr[i]+" and grade is "+(arr[i] >= bestScore-10 ? "A": arr[i]>=bestScore-20 ? "B" : arr[i]>=bestScore-30 ? "C" : "D"));
		}
	}

}
