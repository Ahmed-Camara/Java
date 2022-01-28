import java.io.File;
import java.util.PriorityQueue;
import java.util.Scanner;

public class App{

    public static void main(String[] args){
        if(args.length != 1){
            System.exit(1);
        }

        File file = new File(args[0]);

        if(!file.exists()){
            System.out.println("File entered does not exit");
            System.exit(2);
        }
        if(!file.isFile()){
            System.out.println("File name entered is not a valid file");
            System.exit(3);
        }

        try {
            Scanner input = new Scanner(file);
            PriorityQueue<String> queue = new PriorityQueue<>();

            while(input.hasNext()){
                queue.offer(input.next());
            }

            while(queue.size() > 0){

                System.out.println(queue.poll());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}