public class App {
    public static void main(String[] args) {
        int[] p = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = 4;
        
        System.out.println(rodCutt(p,n));
        System.out.println(memoizedRodCut(p,n));
    }

    public static int rodCutt(int[]p, int n){
        if(n==0)
            return 0;
        int q = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++){
            q = Math.max(q,p[i-1] + rodCutt(p,n-i));
        }
        return q;
    }
    public static int memoizedRodCut(int[] p, int n){

        int[] r = new int[n+1];
        for (int i = 0; i <= n; i++){
            r[i] = Integer.MIN_VALUE;
        }

        return memoizedRodCut(p,n,r);
    }

    public static int memoizedRodCut(int[]p, int n, int[] r){
        if(r[n] >= 0)
            return r[n];
        int q;
        if (n == 0)
            q = 0;
        else{
            q = Integer.MIN_VALUE;
            for(int i = 1; i <= n; i++){
                q = Math.max(q,p[i-1]+memoizedRodCut(p,n-i,r));
            }
        }

        r[n] = q;
        return q;
    }
}
