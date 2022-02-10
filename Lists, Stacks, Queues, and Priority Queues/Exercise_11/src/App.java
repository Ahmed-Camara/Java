import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String expression = input.nextLine();

        System.out.println(EvaluateExpression(expression) ? "Balanced":"Not Balanced");
    }

    public static boolean EvaluateExpression(String expression){
        Stack<Character> stack = new Stack<>();
        boolean validity = false;
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                validity = false;
                stack.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']' && !processStack(stack,ch)){
/*
                validity = processStack(stack,ch);
                if (validity == false)
                    break;*/
                return false;
            }
        }
        return validity;
    }
    private static boolean processStack(Stack<Character> stack, char ch){
        char op = stack.pop();

        if (ch == ')' && op == '(')
            return true;
        else if (ch == '}' && op == '{')
            return true;
        else if (ch == ']' && op == '[')
            return true;

        return false;
    }
}
