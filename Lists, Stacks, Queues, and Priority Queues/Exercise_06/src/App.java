import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < 5000000; i++){
            list.add((int)Math.random() * 100 + 1);
        }
        long start = System.currentTimeMillis();
        for (Integer i: list) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time in milliseconds using get() function : "+(end-start));

        start = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            iterator.next();
        }
        end = System.currentTimeMillis();
        System.out.println("Time in milliseconds using iterator function : "+(end-start));
    }
}
