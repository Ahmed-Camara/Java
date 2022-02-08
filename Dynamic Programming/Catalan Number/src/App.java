public class App {
    public static void main(String[] args) {

        //1. Catalan number without dynamic programming
        for (int i = 0; i < 10; i++){
            System.out.print(catalanNumber(i)+" ");
        }

        //2. Catalan number with dynamic programming
    }

    public static int catalanNumber(int n){
        if(n<=1)
            return 1;
        int res = 0;
        for(int i = 0; i < n; i++){
            res = res + catalanNumber(i) * catalanNumber(n-i-1);
        }

        return res;
    }
}
