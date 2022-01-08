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

    public static int count(String str, char a){
        return count(str,a,0,0);
    }

    public static int count(String str, char a , int index,int res){

        if(str.equals(""))
            return res;
        String low = str.toLowerCase();
        char c = low.charAt(index);
        if(c == Character.toLowerCase(a)){
            res = res + 1;
        }

        return count(str.substring(1),a,index,res);
    }
}
