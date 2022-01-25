public class App {
    public static void main(String[] args) {
        Complex[][] m1 = new Complex[3][3];
        Complex[][] m2 = new Complex[3][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m1[i][j] = new Complex(roundedRandom(), roundedRandom());
                m2[i][j] = new Complex(roundedRandom(), roundedRandom());
            }
        }

        ComplexMatrix complexMatrix = new ComplexMatrix();

        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, complexMatrix.addMatrix(m1, m2), '+');

        System.out.println("\nm1 + m2 is ");
        GenericMatrix.printResult(m1, m2, complexMatrix.multiplyMatrix(m1, m2), '*');
    }

    public static double roundedRandom() {
        return Math.round(Math.random() * 10);
    }
}
