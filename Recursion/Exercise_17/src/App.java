import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of characters: ");
        String s = input.nextLine();
        char[] chars = s.replaceAll(" ", "").toCharArray();

        System.out.println();
        System.out.print("Enter character : ");
        char ch = input.next().charAt(0);

        System.out.println(count(chars,ch));
    }

    public static int count(char[] chars,char ch){
        return count(chars,ch,0);
    }
    public static int count(char[] chars,char ch, int high){
        int c = 0;

        if (high > chars.length-1) { return c; }
        if(chars[high] == ch)
            c = c + 1;

        return c + count(chars,ch,high+1);
    }
}
