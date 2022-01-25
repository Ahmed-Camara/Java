import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> p = new ArrayList<>();
        p.add(12);
        p.add(2);
        p.add(32);
        p.add(4);
        p.add(52);
        p.add(53);
        p.add(54);
        p.add(55);
        System.out.println(p);
        sort(p);

        System.out.println(p);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        sort(list,0,list.size()-1);
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list,int low, int high){

        if(low > high)
            return;
        E max = list.get(low);
        int maxIndex = low;
        for(int i = low+1; i <= high; i++){
            if(max.compareTo(list.get(i)) > 0){
                max = list.get(i);
                maxIndex = i;
            }
        }

        list.set(maxIndex,list.get(low));
        list.set(low,max);

        sort(list,low+1,high);
    }
}
