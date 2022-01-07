public class App {
    public static void main(String[] args) {
        System.out.println(sumSeries(1));
    }

    public static double sumSeries(int num){
        return sumSeries(num,10,1,0.0);
    }

    public static double sumSeries(int num, int limit, double iter,double result){

        if(limit <= 0)
            return result;

        result = result + (num / iter);
        return  sumSeries(num,limit-1,iter+1,result);
    }
}
