/**
 * Sorts an array in (at worst) O(n^2) time by
 * picking a pivot, and putting everything bigger
 * than the pivot to the right of the pivot, and
 * everything smaller than the pivot to the left -
 * and then continuing this process recursively.
 * In this case the pivot chosen is the middle
 * index for each iteration.
 */
public class QuickSort {

    static int swaps = 0;

    public static int[] sort(int[] array) {

        sort_r(array, 0, array.length - 1);

        System.out.println("Number of swaps: " + swaps);
        return array;
    }

    private static int[] sort_r(int[] array, int low, int high) {

        if (low >= high) {
            return array;
        }

        int p = partition(array, low, high);
        sort_r(array, low, p - 1);
        sort_r(array, p + 1, high);

        return array;
    }

    private static int partition(int[] part, int low, int high) {
        
        int temp;
        int pivotIndex = low + ((high - low)/2);
        int pivot = part[pivotIndex];
        part[pivotIndex] = part[high];
        part[high] = pivot;
        swaps++;
        
        int left = low;
        int right = high - 1;

        while (left <= right) {
            while (left <= right && part[left] <= pivot) {
                left++;
            }
            while (right >= left && part[right] >= pivot) {
                right--;
            }
            if (left < right) {
                temp = part[left];
                part[left] = part[right];
                part[right] = temp;
                swaps++;
            }
        }
        temp = part[left];
        part[left] = part[high];
        part[high] = temp;
        swaps++;

        return left;
    }
}
