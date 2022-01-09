import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of characters: ");
        String s = input.nextLine();
        char[] chars = s.replaceAll(" ", "").toCharArray();

        System.out.println(count(chars));
    }

    public static int count(char[] chars){
        return count(chars,0);
    }
    public static int count(char[] chars,int high){

        int c = 0;

        if (high > chars.length-1) { return c; }
        if(Character.isUpperCase(chars[high]))
            c = c + 1;

        return c + count(chars,high+1);
    }
}
