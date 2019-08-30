

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int[] copy(int[] array){
        int[] clone = new int[array.length];
        for (int i = 0; i < array.length; i++){
            clone[i] = array[i];
        }
        return clone;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] clone = new int[array.length];
        int tick = 0;
        for (int i = array.length - 1; i >= 0; i--){
            clone[tick] = array[i];
            tick++;
        }
        return clone;
    }
    
}
