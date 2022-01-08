public class App {
    public static void main(String[] args) {
        //call recursive function
        reverseDisplay("abcd");
    }
    public static void reverseDisplay(String value){

        if(value.equals(""))
            return;

        int high = value.length()-1;
        System.out.print(value.charAt(high));
        String x = value.substring(0,high);
        reverseDisplay(x);
    }
}
