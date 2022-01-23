import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        GenericStack<String> s1 = new GenericStack<>();
        GenericStack<Object> s2 = new GenericStack<>();

        s1.push("Java");
        s1.push("Python");
        s1.push("C++");

        s2.push(2);

        add(s1,s2);
        print(s2);
    }

    public static <T> void add(GenericStack<T> s1, GenericStack<? super T> s2){
        while (!s1.isEmpty())
            s2.push(s1.pop());
    }

    public static void print(GenericStack<?> s){
        while (!s.isEmpty())
            System.out.print(s.pop()+" ");

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