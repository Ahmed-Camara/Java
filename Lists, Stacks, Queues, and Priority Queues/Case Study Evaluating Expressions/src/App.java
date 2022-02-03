import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expressions = input.nextLine();
        try {

        }catch (Exception e){
            System.out.println("Wrong expression : "+expressions);
        }
    }

    public static int evaluateExpression(String expression){
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
    }
}
