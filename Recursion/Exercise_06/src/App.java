public class App {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){

            System.out.println(i+" : "+sumSeries(i));
        }
    }

    public static double sumSeries(int i){
        return sumSeries(i,1.0/2);
    }

    public static double sumSeries(int i,double result){

        if(i==1)
            return result;

        double den = i + 1;
        double frac = i / den;
        result = result + frac;
        return sumSeries(i-1,result);
    }
}
