public class App {
    private static final int MAX = 100;
    private static int tab[] = new int[MAX];
    private static final int s = -1;
    private static int count = 0;
    private static int countDP = 0;
    public static void main(String[] args) {
        System.out.println(fib(40));
        System.out.println("Function has been called without using DP : "+count+" times");
        App.initialization();
        System.out.println(dpFib(40));
        System.out.println("Function has been called with using DP : "+countDP+" times");
    }

    public static int fib(int x){
        count++;
        if(x <= 1)
            return x;

        return fib(x-1)+fib(x-2);
    }

    public static int dpFib(int x){
        countDP++;
        if(x<=1)
            return 1;
        if(tab[x] != -1)
            return tab[x];

        tab[x] = dpFib(x-1) + dpFib(x-2);

        return dpFib(x-1) + dpFib(x-2);
    }

    private static void initialization(){
        for(int i = 0; i < MAX; i++){
            tab[i] = s;
        }
    }
}
