import java.util.Scanner;

public class App {
    private static long []tab = new long[50];
    public static void main(String[] args) {
        int numTest;
        Scanner in = new Scanner(System.in);
        numTest = in.nextInt();
        long []res = new long[numTest+1];
        for (int i = 0; i < numTest; i++){
            res[i] = factorial(i+1);
        }

        for (int i = 0; i < res.length-1; i++){
            System.out.println(res[i]);
        }
    }
    public static long factorial(int x){
        if(x <= 2)
            return x;

        if(tab[x] != 0)
            return tab[x];

        return x * factorial(x-1);
    }
}
