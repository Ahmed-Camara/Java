import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        GenericStack<String> as = new GenericStack<>();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            String in = input.nextLine();
            as.push(in);
        }
        int size = as.getSize();

        for(int i = 0; i < size; i++){
            System.out.print(as.pop()+" ");
        }
    }
}
