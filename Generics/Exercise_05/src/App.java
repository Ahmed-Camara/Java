public class App {
    public static void main(String[] args) {
        Integer[] list = {1,2,3,4,5,100};
        System.out.println(max(list));
    }
    public static <E extends Comparable<E>> E max(E[]list){
        E item = list[0];
        E max = null;

        for(int i = 0; i < list.length; i++){

            if(list[i].compareTo(item) > 0)
                max = list[i];
        }

        return max;
    }
}
