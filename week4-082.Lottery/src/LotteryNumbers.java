import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random randomizer;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.randomizer = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        
        while (this.numbers.size() < 7){
            int candidate = this.randomizer.nextInt(39) + 1;
            if (!containsNumber(candidate)){
                this.numbers.add(candidate);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
