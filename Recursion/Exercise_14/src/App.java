import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("Enter a string : ");
        input = sc.nextLine();

        System.out.println("There are "+findNumberOfUppercaseLetter(input)+" number of uppercase in "+input);
    }

    public static int findNumberOfUppercaseLetter(String str){
        return findNumberOfUppercaseLetter(str,0,0);
    }

    public static int findNumberOfUppercaseLetter(String str, int index,int count){

        if(str.equals(""))
            return count;

        if(Character.isUpperCase(str.charAt(index)))
            count = count + 1;

        return findNumberOfUppercaseLetter(str.substring(1),index,count);
    }
}
