import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        int fac = 1;
        
        while (n > 0){
            fac *= n;
            n--;
        }
        
        System.out.println("Factorial is " + fac);

    }
}
