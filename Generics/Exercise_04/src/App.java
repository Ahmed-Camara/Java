import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] list = new Integer[5];
        System.out.println("Enter integers list items : ");
        for(int i = 0; i < 5; i++){
            list[i] = input.nextInt();
        }

        System.out.print("Enter key to search : ");
        int key = input.nextInt();
        int index = linearSearch(list,key);

        if(index == -1){
            System.out.println("Key : "+key+" not found");
        }else{
            System.out.println("Key : "+key+" found at index "+index);
        }
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key){
        for(int i = 0; i < list.length-1; i++){
            E tp = list[i];
            if(tp.compareTo(key) == 0){
                return i;
            }
        }
        return -1;
    }
}
