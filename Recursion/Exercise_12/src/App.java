import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter a string : ");
        s = sc.nextLine();
        System.out.print("\n The reversed version of the string "+s+" is : ");
        reverseDisplay(s);
    }

    public static void reverseDisplay(String value){
         reverseDisplay(value,value.length()-1);

    }
    public static void reverseDisplay(String value,int high){
        if(high < 0)
            return;

        System.out.print(value.charAt(high));
        high = high-1;
        reverseDisplay(value,high);
    }
}
