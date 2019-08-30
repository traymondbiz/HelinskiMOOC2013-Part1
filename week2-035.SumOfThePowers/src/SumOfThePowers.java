
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        int result = 0;
        
        while (n >= 0){
            result += (int) Math.pow(2, n);
            n--;
        }
        
        System.out.println("Result is " + result);

    }
}
