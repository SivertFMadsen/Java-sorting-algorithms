import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        int[] unSorted = generateArray(100, 1000);
        SelectionSort selectionSort = new SelectionSort(); 
        int[] sorted = selectionSort.sortHere(Arrays.copyOf(unSorted, unSorted.length));

        // QuickSort.sort(Arrays.copyOf(unSorted, unSorted.length));

        for (int num : sorted) {
            System.out.println(num);
        }
    }

    public static int[] generateArray(int length, int maxValue) {

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * maxValue);
        }
        
        return array;
    }
}
