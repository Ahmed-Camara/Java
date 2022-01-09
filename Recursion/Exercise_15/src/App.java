import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter a character: ");
        char c = input.nextLine().charAt(0);

        System.out.println("The character "+c+" occurs "+count(str, c)+" times in the string "+str);
    }

    public static int count(String str,char a){
        return count(str,a,str.length()-1);
    }

    public static int count(String str,char a, int high){
        int count = 0;
        if(str.equals(""))
            return count;

        String low = str.toLowerCase();
        char c = low.charAt(0);
        if(c == Character.toLowerCase(a)){
            count = count + 1;
        }

        return count + count(str.substring(1),a,high);

    }
}
