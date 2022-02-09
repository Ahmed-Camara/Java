public class App {
    private static final int[]cat = new int[100];
    public static void main(String[] args) {

        //1. Catalan number without dynamic programming
        for (int i = 0; i < 10; i++){
            System.out.print(catalanNumber(i)+" ");
        }
        System.out.println();
        //2. Catalan number with dynamic programming
        for (int i = 0; i < 10; i++){
            System.out.print(DPcatalanNumber(i)+"  ");
        }
    }

    public static int catalanNumber(int n){
        if(n <= 1)
            return 1;
        int res = 0;
        for(int i = 0; i < n; i++){
            res = res + catalanNumber(i) * catalanNumber(n-i-1);
        }

        return res;
    }
    public static int DPcatalanNumber(int n){
        cat[0] = cat[1] = 1;

        for (int i = 2; i <= n; i++){
            cat[i] = 0;
            for (int j = 0; j < i; j++){
                cat[i] += cat[j] * cat[i-j-1];
            }
        }

        return cat[n];
    }
}
