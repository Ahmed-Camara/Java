import java.util.PriorityQueue;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable {

    @Override
    public Object clone(){
        MyPriorityQueue<E> obj = new MyPriorityQueue<>();

        for(E o : this){
            obj.offer(o);
        }

        return obj;
    }
}
