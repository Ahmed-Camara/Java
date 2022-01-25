import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        System.out.println("Original list : ");
        System.out.println(list);
        System.out.println("Shuffled list : ");
        shuffle(list);
        System.out.println(list);
    }

    public static <E> void shuffle(ArrayList<E> list){

        for(int i = 0; i < list.size(); i++){
            // let's generate random number between 0 and size of our list
            int index = (int) (Math.random() * list.size() + 0);
            //replace the element at random index with the first element of the list
            E el = list.get(i);
            list.set(i,list.get(index));
            list.set(index,el);
        }
    }
}
