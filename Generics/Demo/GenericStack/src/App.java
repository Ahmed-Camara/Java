public class App {
    public static void main(String[] args){
        GenericStack<String> stack1 = new GenericStack<>();

        stack1.push("London");
        stack1.push("Berlin");
        stack1.push("Paris");
        stack1.push("CIV");
        System.out.println(stack1);
    }
}
