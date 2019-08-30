
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        
        // Populate student list with user input.
        while (true){
            System.out.print("name: ");
            String name = read.nextLine();
            if (name.equals("")){
                break;
            }
            
            System.out.print("studentnumber: ");
            String number = read.nextLine();
            
            list.add(new Student(name, number));
        }
        
        // Print student list.
        for (Student student : list){
            System.out.println(student);
        }
        
        // Query for search terms.
        System.out.print("Give search term: ");
        String searchTerm = read.nextLine();
        System.out.println("Result:");
        for (Student student : list){
            if (student.getName().contains(searchTerm)){
                System.out.println(student);
            }
        }

    }
}
