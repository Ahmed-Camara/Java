public class App {
    public static void main(String[] args) {
        Integer[] intars = {new Integer(2),new Integer(4),new Integer(3)};
        Double[] doublears = {new Double(3.4),new Double(1.3),new Double(-22.1)};
        Character[] charars = {new Character('a'),new Character('j'),new Character('r')};
        String[] strars = {new String("Tom"),new String("Suzan"),new String("Kim")};

        System.out.println("Before sorting : ");
        print(intars);
        print(doublears);
        print(charars);
        print(strars);
        System.out.println("*************** SORTING ***************");
        sort(intars);
        sort(doublears);
        sort(charars);
        sort(strars);
        System.out.println("*************** SORTING ENDED ***************");

        System.out.println("After sorting : ");
        print(intars);
        print(doublears);
        print(charars);
        print(strars);
    }

    public static <E> void print(E[] arr){

        for(E a : arr){
            System.out.print(a+" => ");
        }

        System.out.println();
    }
    public static <E extends Comparable<E>> void sort(E[]arr){
        E currentMin;
        int currentMinIndex;

        for(int i = 0; i < arr.length-1; i++){
            currentMin = arr[i];
            currentMinIndex = i;

            for(int j = i+1; j < arr.length; j++){

                if(currentMin.compareTo(arr[j]) > 0){
                    currentMin = arr[j];
                    currentMinIndex = j;
                }
            }

            if(currentMinIndex != i){

                arr[currentMinIndex] = arr[i];
                arr[i] = currentMin;
            }
        }
    }
}
