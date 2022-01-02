import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        System.out.println("Is moon a palindrome ? "+isPalindrom("moon"));
        System.out.println("Is noon a palindrome ? "+isPalindrom("noon"));
        System.out.println("Is a a palindrome ? "+isPalindrom("a"));
        System.out.println("Is aba a palindrome ? "+isPalindrom("aba"));
        System.out.println("Is ab a palindrome ? "+isPalindrom("ab"));
        System.out.println("*********************************************************************");
        double []arr = {6.5,1.0,0.0,8.5,9.1};
        sort(arr);
        for(double a : arr)
            System.out.print(a+" ");
        System.out.println();
        System.out.println("*********************************************************************");
        int []as = {1,2,3,4,5,6,7,8,9,10};
        int x = recursiveBinarySearch(as,6);

        if(x == -1){
            System.out.println("Not found");
        }else{
            System.out.println(as[x]+" found at index : "+x);
        }
        System.out.println("*********************************************************************");
        System.out.println("Enter a directory of file : ");
        Scanner input = new Scanner(System.in);
        String directory = input.nextLine();
        System.out.println(getSize(new File(directory))+" bytes");
    }

    public static boolean isPalindrom(String s){
/*
        if(s.length() <= 1)
            return true;
        else if(s.charAt(0) != s.charAt(s.length() - 1))
            return false;

        return isPalindrom(s.substring(1,s.length() - 1));*/
        return isPalindrom(s,0,s.length() - 1);
    }

    public static boolean isPalindrom(String s,int low,int high){
        if(high <= low)
            return true;
        else if(s.charAt(low) != s.charAt(high))
            return false;

        return isPalindrom(s,low+1,high - 1);
    }

    public static void sort(double[] list){
        sort(list,0, list.length - 1);
    }

    public static void sort(double[] list, int low, int high){
        if(low<high){
            int indexOfMin = low;
            double min = list[low];

            for(int i = low + 1; i <= high; i++){
                if(list[i] < min){
                    min = list[i];
                    indexOfMin = i;
                }
            }

            list[indexOfMin] = list[low];
            list[low] = min;
            sort(list,low+1,high);
        }
    }

    public static int recursiveBinarySearch(int[] list, int key){
        return recursiveBinarySearch(list,key,0,list.length - 1);
    }

    public static int recursiveBinarySearch(int[] list, int key, int low, int high){
        if(low > high)
            return -1;
        int mid = (low + high) / 2;

        if(list[mid] == key)
            return mid;
        else if(key < list[mid])
            return recursiveBinarySearch(list,key,low,mid - 1);

        return recursiveBinarySearch(list,key,mid+1,high);
    }

    public static long getSize(File file){
        long size = 0;

        if(file.isDirectory()){
            File []files = file.listFiles();

            for(int i = 0; files != null && i < files.length; i++){
                size += getSize(files[i]);
            }
        }else{
            size += file.length();
        }
        return size;
    }
}
