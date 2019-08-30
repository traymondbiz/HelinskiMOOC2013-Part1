
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        // Divisible by 4, but NOT divisible by 100.
        if ((year % 4 == 0) && !(year % 100 == 0)){
            System.out.println("The year is a leap year.");
        }
        // If divisible by 100, must also be divisible by 400.
        else if ((year % 100 == 0) && (year % 400 == 0)){
            System.out.println("The year is a leap year.");
        }
        // Otherwise, it is not a leap year.
        else {
            System.out.println("The year is not a leap year.");
        }

    }
}
