public class App {
    public static void main(String[] args) {

        System.out.println(bin2Dec("10101001")); //output : 169
    }

    public static int bin2Dec(String binaryString){
        return bin2Dec(binaryString, binaryString.length() - 1, 1, 0);
    }
    public static int bin2Dec(String binaryString, int position, int binFactor, int value){

        if (position < 0) { return value; }
        char charDigit = binaryString.charAt(position);
        value += binFactor * Integer.parseInt(String.valueOf(charDigit));
        return bin2Dec(binaryString, position - 1, binFactor * 2, value);
    }
}
