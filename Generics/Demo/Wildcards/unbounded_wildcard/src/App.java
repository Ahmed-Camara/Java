import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        GenericStack<Integer> s1 = new GenericStack<>();
        s1.push(1);
        s1.push(2);
        s1.push(-2);
        print(s1);


        GenericStack<String> s2 = new GenericStack<>();

        s2.push("London");
        s2.push("Abidjan");
        s2.push("Yamoussoukro");
        s2.push("Bouake");
        print(s2);

    }

    public static void print(GenericStack<?> s){
        while (!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
    }

}

class GenericStack<E>{
    private ArrayList<E> list = new ArrayList<>();

    public GenericStack(){}

    public int getSize(){
        return list.size();
    }

    public E peek(){
        return list.get(getSize() - 1);
    }

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = peek();

        list.remove(getSize() - 1);

        return o;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    @Override
    public String toString(){
        return "Stack : "+list.toString();
    }
}