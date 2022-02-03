public class App {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4 };
        System.out.println("Minimum number of multiplications is "
                + memoizedMatrixChain(arr));
    }

    public static int memoizedMatrixChain(int []p){
        int n = p.length;
        int [][]m = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                m[i][j] = Integer.MAX_VALUE;
            }
        }

        return lookupChain(m,p,1,n-1);
    }

    public static int lookupChain(int [][]m, int []p, int i, int j){
        if (m[i][j] < Integer.MAX_VALUE)
            return m[i][j];

        if (i == j)
            m[i][j] = 0;

        else{
            for (int k = i; k < j-1; k++){
                int q = lookupChain(m,p,i,k) + lookupChain(m,p,k+1,j)+p[i-1] * p[k] * p[j];

                if(q < m[i][j])
                    m[i][j] = q;
            }
        }



        return m[i][j];
    }
}
