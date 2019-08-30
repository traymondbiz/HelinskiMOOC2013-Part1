
import java.util.Scanner;

public class Main {

    // Exception thrown only when Eternal Clock (Bonus Exercise) is active.
    public static void main(String[] args) /*throws Exception*/ {
        Scanner reader = new Scanner(System.in);
        
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        // Comment out if using Eternal Clock.
        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine());
        
        // Comment out if using Eternal Clock.
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        
        // Eternal Clock (Bonus Exercise)
//        seconds.setValue(50);
//        minutes.setValue(59);
//        hours.setValue(23);
        
        
        // Comment out if using Eternal Clock.
        for (int i = 0; i < 121; i++){
            System.out.println(hours + ":" + minutes + ":" + seconds);

            seconds.next();
            if (seconds.getValue() == 0){
                minutes.next();
                if (minutes.getValue() == 0){
                    hours.next();
                }
            }
        }
    
        
        // Eternal Clock (Bonus Exercise)
//        while (true){
//            System.out.println(hours + ":" + minutes + ":" + seconds);
//            Thread.sleep(1000);
//            seconds.next();
//
//            if (seconds.getValue() == 0){
//                minutes.next();
//                if (minutes.getValue() == 0){
//                    hours.next();
//                }
//            }
//        }
        
    }
}
