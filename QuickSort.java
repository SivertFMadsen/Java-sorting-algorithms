/**
 * Sorts an array in (at worst) O(n^2) time by
 * picking a pivot, and putting everything bigger
 * than the pivot to the right of the pivot, and
 * everything smaller than the pivot to the left -
 * and then continuing this process recursively.
 * In this case the pivot chosen is the middle
 * index for each iteration.
 */
public class QuickSort extends Sorter {

    static int swaps = 0;

    @Override
    void sort() {

        sort_here(A);
    }

    @Override
    String algorithmName() {
        return "Quick ;)";
    }

    public int[] sort_here(int[] array) {

        sort_r(array, 0, array.length - 1);

        // System.out.println("Number of swaps: " + swaps);
        return array;
    }

    private int[] sort_r(int[] array, int low, int high) {

        if (geq(low, high)) {
            return array;
        }

        int p = partition(array, low, high);
        sort_r(array, low, p - 1);
        sort_r(array, p + 1, high);

        return array;
    }

    private int partition(int[] part, int low, int high) {
        
        int temp;
        int pivotIndex = low + ((high - low)/2);
        int pivot = part[pivotIndex];
        // part[pivotIndex] = part[high];
        // part[high] = pivot;
        swap(pivotIndex, high);
        // swaps++;
        
        int left = low;
        int right = high - 1;

        while (leq(left, right)) {
            while (leq(left, right) && leq(part[left], pivot)) {
                left++;
            }
            while (geq(right, left) && geq(part[right], pivot)) {
                right--;
            }
            if (lt(left, right)) {
                // temp = part[left];
                // part[left] = part[right];
                // part[right] = temp;
                swap(left, right);
                // swaps++;
            }
        }
        // temp = part[left];
        // part[left] = part[high];
        // part[high] = temp;
        swap(left, high);
        // swaps++;

        return left;
    }
}
