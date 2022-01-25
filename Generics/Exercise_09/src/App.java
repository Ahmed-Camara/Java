import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            list.add(input.nextInt());
        }
        System.out.println("Before Sorting : ");
        System.out.println(list);
        sort(list);
        System.out.println("After Sorting : ");
        System.out.println(list);
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
