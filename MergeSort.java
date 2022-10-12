import java.util.Arrays;
/**
 * Sorts an array in (at worst) O(n logn) time by
 * recursively dividing the array in half and 
 * 'braiding' the smaller parts together in a 
 * sorted way. 
 */

public class MergeSort extends Sorter {

    static int swaps = 0;

    void sort() {

        sort_here(A);

    }
    
    public static int[] sort_here(int[] array) {

        if (leq(array.length, 1)) {
            return array;
        }

        int i = (array.length)/2;
        int[] part1 = sort_here(Arrays.copyOfRange(array, 0, i));
        int[] part2 = sort_here(Arrays.copyOfRange(array, i, array.length));
        return merge(part1, part2, array);
    }

    private static int[] merge(int[] part1, int[] part2, int[] array) {

        int i = 0;
        int j = 0;

        while (lt(i, part1.length) && lt(j, part2.length)) {
            if (leq(part1[i], part2[j])) {
                array[i + j] = part1[i];
                i++;
            } else {
                array[i + j] = part2[j];
                j++;
            }
        }
        while (leq(i, part1.length)) {
            array[i + j] = part1[i];
            i++;
        }
        while (leq(j, part2.length)) {
            array[i + j] = part2[j];
            j++;
        }

        return array;
    }
}
