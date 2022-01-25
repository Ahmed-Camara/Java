public class App {
    public static void main(String[] args) {

        GenericStack<Integer> as = new GenericStack<>();
        as.push(1);
        as.push(2);
        as.push(3);
        System.out.println(as);
        while (!as.isEmpty()){
            System.out.print(as.pop()+" ");
        }
    }
}
