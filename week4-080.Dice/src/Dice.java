import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.random = new Random();
    }

    public int roll() {
        // Add one to remove possibility of rolling a '0', and includes the possibility of rolling 'numberOfSides'
        // Since random.nextInt(int val) uses val as an exclusive boundary.
        return (random.nextInt(numberOfSides) + 1);
    }
}
