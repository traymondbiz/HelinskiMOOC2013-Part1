
public class Main {

    public static void main(String[] args) {
        NightSky sky = new NightSky(0.3, 20, 20);
        sky.print();
        System.out.println("Number of stars: " + sky.starsInLastPrint());
    }
}
