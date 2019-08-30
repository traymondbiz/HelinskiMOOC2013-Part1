import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdBase = new BirdDatabase();
        
        while (true){
            System.out.print("? ");
            String response = scanner.nextLine();
            
            if (response.equals("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();
                birdBase.addBird(name, latinName);
            }
            else if (response.equals("Observation")){
                System.out.print("What was observed:? ");
                String name = scanner.nextLine();
                try {
                    birdBase.addObservation(name);
                }
                catch (IllegalArgumentException e){
                    System.out.println("Is not a bird!");
                }
            }
            else if (response.equals("Statistics")){
                birdBase.statistics();
            }
            else if (response.equals("Show")){
                System.out.print("What? ");
                String name = scanner.nextLine();
                try {
                    birdBase.show(name);
                }
                catch (IllegalArgumentException e){
                    System.out.println("Is not a bird!");
                }
            }
            else if (response.equals("Quit")){
                break;
            }
            else {
                System.out.println("Invalid response!");
            }
        }
    }
}
