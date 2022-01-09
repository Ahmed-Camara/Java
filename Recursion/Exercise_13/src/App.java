import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 8 integers: ");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(findLargest(arr));
    }


    public static int findLargest(int[] arr){
        return findLargest(arr,0);
    }

    public static int findLargest(int[] arr, int i){

        if(i == arr.length-1)
            return arr[i];

        return Math.max(arr[i],findLargest(arr,i+1));
    }
}
