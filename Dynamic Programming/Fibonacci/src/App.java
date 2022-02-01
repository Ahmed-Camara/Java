public class App {
    private static final int MAX = 100;
    private static int count = 0;
    private static int countDP = 0;
    public static void main(String[] args) {
        System.out.println(fib(40));
        System.out.println("Function has been called without using DP : "+count+" times"); //output : 331160281 times
        System.out.println(dpFib(40));
        System.out.println("Function has been called with using DP : "+countDP+" times"); //output :  79 times


    }

    public static int fib(int x){
        count++;
        if(x <= 1)
            return x;

        return fib(x-1)+fib(x-2);
    }
    public static int dpFib(int x){
        int tab[] = new int[MAX];
        initialization(tab);

        return dpFib(tab,x);
    }
    public static int dpFib(int[]tab,int x){
        countDP++;
        if(x<=1)
            return x;
        if(tab[x] != -1)
            return tab[x];

        tab[x] = dpFib(tab,x-1) + dpFib(tab,x-2);

        return tab[x];
    }

    private static void initialization(int []tab){
        for(int i = 0; i < MAX; i++){
            tab[i] = -1;
        }
    }
}
