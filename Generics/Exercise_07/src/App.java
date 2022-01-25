public class App {
    public static void main(String[] args) {
        Integer[]list = {1,2,3,4,5,6,7,8};

        int key = 5;
        int index = binarySearch(list,key);
        System.out.println("Display list : ");
        System.out.print("[");
        for (Integer i : list){
            System.out.print(i+" ");
        }
        System.out.print("]");
        System.out.println();
        if(index == -1){
            System.out.println("The key "+key+" does not exist in the list");
        }else{
            System.out.println("The key "+key+" is found at index "+index);
        }

    }

    public static <E extends Comparable<E>>  int binarySearch(E[] list, E key){
        return binarySearch(list,0, list.length-1, key);
    }

    private static <E extends Comparable<E>>  int binarySearch(E[] list,int low, int high, E key){

        int mid = (low + high) / 2;
        if(low > high)
            return -1;
        if(list[mid].compareTo(key) == 0)
            return mid;
        else if(key.compareTo(list[mid]) > 0)
            return binarySearch(list,mid+1,high,key);
        else
            return binarySearch(list,low,mid,key);
    }
}
