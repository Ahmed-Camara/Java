import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The binary version of  "+n+" is : "+dec2Bin(n));
    }

    public static String dec2Bin(int value){
        return dec2Bin(value,"");
    }

    public static String dec2Bin(int n,String result){

        if(n==0)
            return result;
        result = (n%2) + result;

        return dec2Bin(n/2,result);
    }
}
