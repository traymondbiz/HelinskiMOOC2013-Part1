import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random randomizer;
    private String symbolList = "abcdefghijklmnopqrstuvwxyz";
    

    public PasswordRandomizer(int length) {
        this.length = length;
        this.randomizer = new Random();
    }

    public String createPassword() {
        StringBuilder password = new StringBuilder("");
        
        for (int i = 0; i < length; i++){
            password.append(symbolList.charAt(randomizer.nextInt(26)));
        }
        
        return password.toString();
    }
}
