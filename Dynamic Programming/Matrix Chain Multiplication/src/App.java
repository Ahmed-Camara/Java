public class App {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6}};
        int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] c = matrix_multiply(a,b);

        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c[0].length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] matrix_multiply(int[][]a, int[][] b){
        //if # of cols of a does not match with the # of rows of b
        if(a[0].length != b.length){
            throw new RuntimeException("Matrices dimension do not match");
        }

        int[][] c = new int[a.length][b[0].length];

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b[0].length; j++){
                c[i][j] = 0;
                for(int k = 0; k < a[0].length; k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
