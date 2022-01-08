import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int num;

        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.println("The sum of all digits is : "+sumDigits(num));
    }

    public static int sumDigits(int num){
        int res = 0;

        if(num % 10 == 0)
            return res;

        res = res + (num%10);

        return res + sumDigits(num/10);
    }
}
