public class App {
    public static void main(String[] args) {

        MyPriorityQueue<String> cities = new MyPriorityQueue<>();
        cities.offer("Abidjan");
        cities.offer("Bouake");
        cities.offer("Yakro");
        cities.offer("Seguela");
        System.out.println(cities); // [Abidjan, Bouake, Yakro]

        MyPriorityQueue<String> citiesClone = (MyPriorityQueue<String>) cities.clone();
        System.out.println(citiesClone); // [Abidjan, Bouake, Yakro]

        cities.offer("Odienne");
        citiesClone.offer("Bouafle");

        System.out.println(cities); // [Abidjan, Bouake, Yakro,Odienne]
        System.out.println(citiesClone); // [Abidjan, Bouake, Yakro,Bouafle]
    }
}
