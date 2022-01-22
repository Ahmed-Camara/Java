public class App {
    public static void main(String[] args) {
        Store<Integer> s = new Store<>();
        s.setItem(25);
        System.out.println(s);

        Store<String> s2 = new Store<>();
        s2.setItem("Hello");
        System.out.println(s2);

        System.out.println("******************* HASHTABLE CLASS *******************");
        HashTable<String,Integer> hash = new HashTable<>("Hello",25);
        System.out.println(hash);
    }
}

class Store<T>{
    private T item;

    public void setItem(T t){
        this.item = t;
    }

    public T getItem(){
        return this.item;
    }

    @Override
    public String toString(){
        return this.item.toString();
    }
}

class HashTable<K,V>{
    private K key;
    private V val;

    public HashTable(K k, V v){
        this.key = k;
        this.val = v;
    }

    @Override
    public String toString(){
        return this.key.toString()+" -- "+this.val.toString();
    }
}