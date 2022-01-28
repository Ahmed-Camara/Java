import java.util.*;

public class App {
    public static void main(String[] args) {
        String[][] capitals = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "St. Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
        };

        System.out.println("The total correct count is : "+QuizTest(capitals));
    }

    public static int QuizTest(String[][] capitals){

        Scanner input = new Scanner(System.in);

        List<String[]> list = new ArrayList<>(Arrays.asList(capitals));
        Collections.shuffle(list);

        int count = 0;

        for(int i = 0; i < list.size(); i++){
            System.out.print("What is the capital of "+list.get(i)[0]+" ? ");
            String ans = input.nextLine();

            if(ans.toLowerCase().equals(list.get(i)[1].toLowerCase())){
                System.out.println();
                System.out.println("Correct answer");
                count++;
            }else{
                System.out.println();
                System.out.println("Incorrect answer, the answe should be "+list.get(i)[1].toLowerCase());
            }
            System.out.println();
            System.out.print("Would you like to continue the game ? ");
            char res = input.nextLine().charAt(0);

            if(res == 'y' || res == 'Y'){
                continue;
            }else{
                break;
            }
        }

        return count;
    }
}
