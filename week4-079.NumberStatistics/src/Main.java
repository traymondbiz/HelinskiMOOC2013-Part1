import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        NumberStatistics nsAll = new NumberStatistics();
        NumberStatistics nsEvens = new NumberStatistics();
        NumberStatistics nsOdds = new NumberStatistics();
        
        System.out.println("Type numbers:");
        while (true){
            int number = Integer.parseInt(reader.nextLine());
            
            if (number == -1){
                break;
            }
            else {
                if (number % 2 == 0){
                    nsEvens.addNumber(number);
                }
                else {
                    nsOdds.addNumber(number);
                }
                nsAll.addNumber(number);
            }
        }
        
        System.out.println("sum: " + nsAll.sum());
        System.out.println("sum of even: " + nsEvens.sum());
        System.out.println("sum of odd: " + nsOdds.sum());
    }
}
