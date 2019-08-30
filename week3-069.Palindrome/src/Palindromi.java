import java.util.Scanner;

public class Palindromi {
    
    public static String reverse(String text){
        StringBuilder sb = new StringBuilder("");
        for (int i = text.length() - 1; i >= 0; i--){
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean palindrome(String text) {
        String reversed = reverse(text);
        
        for (int i = 0; i < text.length() / 2; i++){
            if (!(text.charAt(i) == reversed.charAt(i))){
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
