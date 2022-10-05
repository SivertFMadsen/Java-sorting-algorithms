/**
 * Sorts an array in O(n^2) time by comparing to neighbouring
 * elements, switching them if they are in the wrong order, and
 * continues likewise through the array until everything is sorted.
 */
public class InsertionSort {

    public static int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j-1] > array[j]) {
                // Switches two neighbouring elements
                int temp = array[j-1];

                array[j-1] = array[j];
                array[j] = temp;
                j -= 1;
            }
        }
        return array;
    }
}