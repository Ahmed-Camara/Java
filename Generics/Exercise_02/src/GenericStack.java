import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E> {
    public GenericStack(){}

    public void push(E o){
        add(o);
    }

    public int getSize(){
        return size();
    }
    public E peek(){
        return get(getSize() - 1);
    }

    public E pop(){
        E o = get(size() - 1);
        remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty(){
        return isEmpty();
    }

    @Override
    public String toString(){
        return "Stack : "+super.toString();
    }
}
