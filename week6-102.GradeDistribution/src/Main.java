import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        ArrayList<Integer> scores = queryScores(reader);
        int[] distribution = determineDistribution(scores);
        printDistribution(distribution);
        printAcceptance(distribution);
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
    
    public static ArrayList<Integer> queryScores(Scanner reader){
        ArrayList<Integer> validScores = new ArrayList<Integer>();
        
        System.out.println("Type exam scores, -1 completes: ");
        while (true){
            int score = Integer.parseInt(reader.nextLine());
            if (score == -1){
                break;
            }
            else if (score < 0 || score > 60){
                continue;
            }
            else {
                validScores.add(score);
            }
        }
        return validScores;
    }
    
    public static int[] determineDistribution(ArrayList<Integer> rawScores){
        int[] distribution = new int[6];
        for (int score : rawScores){
            if (score < 0){
                throw new IllegalArgumentException("Invalid Score: Below 0-60 limit, was: " + score);
            }
            else if (score < 30){
                distribution[0]++;
            }
            else if (score < 35){
                distribution[1]++;
            }
            else if (score < 40){
                distribution[2]++;
            }
            else if (score < 45){
                distribution[3]++;
            }
            else if (score < 50){
                distribution[4]++;
            }
            else if (score < 61){
                distribution[5]++;
            }
            else {
                throw new IllegalArgumentException("Invalid Score: Above 0-60 limit, was: " + score);
            }
        }
        return distribution;
    }
    
    public static void printDistribution(int[] distribution){
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--){
            System.out.print(i + ": ");
            for (int j = 0; j < distribution[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void printAcceptance(int[] distribution){
        int allScores = 0;
        for (int scorers : distribution){
            allScores += scorers;
        }
        int accepted = allScores - distribution[0];
        
        System.out.println("Acceptance percentage: " + ((double) (accepted * 100) / allScores));
    }
}
