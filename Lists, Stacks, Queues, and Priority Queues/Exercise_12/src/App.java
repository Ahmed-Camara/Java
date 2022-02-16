public class App {
    public static void main(String[] args) {

        MyPriorityQueue<String> cities = new MyPriorityQueue<>();
        cities.offer("Abidjan");
        cities.offer("Bouake");
        cities.offer("Yakro");
        cities.offer("Seguela");
        cities.offer("Divo");
        System.out.println(cities); // [Abidjan, Bouake, Yakro,Seguela,Divo]

        MyPriorityQueue<String> citiesClone = (MyPriorityQueue<String>) cities.clone();
        System.out.println(citiesClone); // [Abidjan, Bouake, Yakro,Seguela,Divo]

        cities.offer("Odienne");
        citiesClone.offer("Bouafle");

        System.out.println(cities); // [Abidjan, Bouake, Yakro,,Seguela,Divo,Odienne]
        System.out.println(citiesClone); // [Abidjan, Bouake, Yakro,,Seguela,Divo,Bouafle]
    }
}
