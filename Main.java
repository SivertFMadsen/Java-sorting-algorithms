import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        int[] unSorted = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] sorted = MergeSort.sort(Arrays.copyOf(unSorted, unSorted.length));

        // QuickSort.sort(Arrays.copyOf(unSorted, unSorted.length));

        for (int num : sorted) {
            System.out.println(num);
        }
    }
}
