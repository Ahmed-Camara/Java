public class App {
    public static void main(String[] args) {
        Integer[] ari = {new Integer(1),new Integer(2),new Integer(3)};
        Character[] arc = {new Character('a'),new Character('b'), new Character('d')};
        String[] ars = {new String("London"), new String("Paris"), new String("New york"),
                        new String("Austin")};
        print(ari);
        print(arc);
        print(ars);
    }

    public static <T> void print(T[] list){

        for(int i = 0; i < list.length; i++){
            System.out.print(list[i]+"  ");
        }
        System.out.println();
    }
}
