public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int counter = 0;
        while(counter < amount){
            System.out.print("*");
            counter++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int counter = 0;
        while(counter < amount){
            System.out.print(" ");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int whiteSpace = size - 1;
        int stars = 1;
        while (whiteSpace >= 0){
            printWhitespaces(whiteSpace);
            printStars(stars);
            whiteSpace--;
            stars++;
        }
    }

    public static void xmasTree(int height) {
        int whiteSpace = height - 1;
        int startStump = whiteSpace - 1;
        int stars = 1;
        while (whiteSpace >= 0){
            printWhitespaces(whiteSpace);
            printStars(stars);
            whiteSpace--;
            stars += 2;
        }
        
        int counter = 0;
        while (counter < 2){
            printWhitespaces(startStump);
            printStars(3);
            counter++;
        }
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
