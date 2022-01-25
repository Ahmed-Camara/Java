public class App {
    public static void main(String[] args) {
        Integer[][] list = {{10,2,3},{4,105,600},{1,1,1},{805,5,5}};
        System.out.println(max(list));
    }

    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0];

        for(int i = 0; i < list.length; i++){
            for(int j = 0; j < list[i].length; j++){
               if(list[i][j].compareTo(max) > 0){
                   max = list[i][j];
               }
            }
        }

        return max;
    }
}
