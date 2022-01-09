import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = input.nextInt();

        System.out.println(dec2Hex(value));
    }

    public static String dec2Hex(int value){
        boolean startingValueIsZero = (value == 0);
        return dec2Hex(value, "", startingValueIsZero);
    }

    public static String dec2Hex(int value, String hexString, boolean startingValueIsZero){
        if (startingValueIsZero) {
            return "0";
        } else {
            if (value == 0) { return hexString; }
            hexString = getHexDigit(value % 16) + hexString;
            return dec2Hex(value / 16, hexString, startingValueIsZero);
        }
    }

    private static char getHexDigit(int value){

        if(value >= 0 && value <= 9){
            return String.valueOf(value).charAt(0);
        }
        char ch='0';
        if(value == 10)
            ch = 'A';
        else if(value == 11)
            ch = 'B';
        else if(value == 12)
            ch = 'C';
        else if(value == 13)
            ch = 'D';
        else if(value == 14)
            ch = 'E';
        else if(value == 15)
            ch = 'F';

        return ch;
    }
}
