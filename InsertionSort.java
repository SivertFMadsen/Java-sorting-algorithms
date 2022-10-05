/**
 * Sorts an array in (at worst) O(n^2) time by comparing to 
 * neighbouring elements, switching them if they are in the 
 * wrong order, and continues likewise through the array 
 * until everything is sorted.
 */
public class InsertionSort {

    public static int[] sort(int[] array) {

        int numSwitches = 0;

        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[j-1] > array[j]) {
                /**
                 * Switches two neighbouring elements
                 * if they are in the wrong order, and 
                 * continues likewise backwards through 
                 * the array from position 'i'
                 */ 
                int temp = array[j-1];

                array[j-1] = array[j];
                array[j] = temp;
                numSwitches += 1;
                j -= 1;
            }
        }
        // System.out.println("Number of switches: " + numSwitches);
        return array;
    }
}