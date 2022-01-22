import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println(findMinimum(5,10));
        System.out.println(findMinimum('a','b'));
        System.out.println(findMinimum("Tom","Joe"));

        System.out.println("************************ Type Inference ************************");
        //Type Inference
        List<Bucket<String>> list = new ArrayList<>();
        addStore("str",list);
    }
    public static <T> void addStore(T t, List<Bucket<T>> list){
        Bucket<T> bucket = new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println(t.toString()+" has been added to the list");
    }
    public static <T extends Comparable<T>> T findMinimum(T t1, T t2){

        if(t1.compareTo(t2) < 0)
            return t1;

        return t2;
    }
}


class Bucket<T>{
    private T item;

    public void setItem(T t){
        this.item = t;
    }

    public T getItem(){
        return this.item;
    }
}
