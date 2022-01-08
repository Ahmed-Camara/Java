public class App {
    public static void main(String[] args) {
        reverseDisplay(12345);
    }

    public static void reverseDisplay(int value){

        if(value % 10 == 0)
            return;
        int x = value%10;
        System.out.print(x+" ");
        reverseDisplay(value/10);
    }
}
