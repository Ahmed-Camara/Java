

public class App {

    public static void main(String[] args) {
        System.out.println(count("Welcome",'e'));
    }

    public static int count(String str, char a){
        return count(str,a,0,0);
    }

    public static int count(String str, char a , int index,int res){
        
        if(str.equals(""))
            return res;
        String low = str.toLowerCase();
        char c = low.charAt(index);
        if(c == Character.toLowerCase(a)){
            res = res + 1;
        }

        return count(str.substring(1),a,index,res);
    }
}
