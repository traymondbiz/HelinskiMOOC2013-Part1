
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int element : array){
            if (element < smallest){
                smallest = element;
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int smallest = array[0];
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallest = array[index];
        int smallestIndex = index;
        for (int i = index + 1; i < array.length; i++){
            if (array[i] < smallest){
                smallest = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
    
    public static void swap(int[] array, int indexA, int indexB){
        int valueA = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = valueA;
    }
    
    public static void sort(int[] array){
        System.out.println(array);
        for (int i = 0; i < array.length; i++){
            int next = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, next);
            System.out.println(array);
        }
    }

}
