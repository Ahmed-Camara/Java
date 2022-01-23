import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        GenericStack<Integer> s1 = new GenericStack<>();
        s1.push(1);
        s1.push(2);
        s1.push(-2);
        s1.push(4);
        System.out.println("The maximum number in the stack is : "+max(s1));
        sum(Arrays.asList(1,2,-2));
        sum(Arrays.asList(2.5,6.5));
    }
    public static double max(GenericStack<? extends Number> s){

        double max = s.pop().doubleValue();

        while (!s.isEmpty()){
            double val = s.pop().doubleValue();

            if(max < val){
                max = val;
            }
        }

        return max;
    }

    public static void sum(List<? extends Number> list){
        double sum = 0.0;

        for(Number n : list){
            sum = sum + n.doubleValue();
        }

        System.out.println("The sum of the integers value is : "+sum);
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