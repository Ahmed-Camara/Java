import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(42);
        list.add(14);
        list.add(14);
        list.add(72);
        list.add(10);
        list.add(42);
        list = removeDuplicates(list);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("London");
        list1.add("Bouake");
        list1.add("Abidjan");
        list1.add("NY");
        list1.add("London");
        list1.add("NY");
        list1.add("Abidjan");

        list1 = removeDuplicates(list1);
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }
    }
    public static <E>ArrayList<E> removeDuplicates(ArrayList<E> list){

        ArrayList<E> newList = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            if(!newList.contains(list.get(i))){
                newList.add(list.get(i));
            }
        }
        return newList;
    }
}
