import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> wordList = new ArrayList<String>();
        
        while (true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()){
                break;
            }
            else {
                wordList.add(word);
            }
        }
        
        Collections.reverse(wordList);
        System.out.println("You typed the following words: ");
        for (String word : wordList){
            System.out.println(word);
        }
    }
}
