import java.util.Scanner;

public class App {
    public static int count = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter index for a Fibonacci number : ");
        int index = input.nextInt();

        System.out.println("The fibonacci number at index "+index+" is : "+fib(index));
        System.out.println("The fib() function is called "+count+" times");
    }

    public static long fib(int index){
        count++;
        if(index==0)
            return 0;
        else if(index == 1)
            return 1;
        return fib(index-1) + fib(index-2);
    }
}
