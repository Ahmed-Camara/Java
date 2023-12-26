//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("America");
        System.out.println("(1) " + list);

        list.add(0,"Canada");
        System.out.println("(2) " + list);

        list.add("Russia");
        System.out.println("(3) " + list);

        list.add("France");
        System.out.println("(4) " + list);

        list.add("Germany");
        System.out.println("(5) " + list);

        list.add("Norway");
        System.out.println("(6) " + list);

        list.add("Poland");
        System.out.println("(7) " + list);

        list.remove(0);
        System.out.println("(8) " + list);

        list.remove(2);
        System.out.println("(9) " + list);

        list.remove(list.size() - 1);
        System.out.println("(10) " + list);

        for (String s : list){
            System.out.println(s.toUpperCase() + " ");
        }
    }
}