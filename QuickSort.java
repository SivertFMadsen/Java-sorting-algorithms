/**
 */
public class QuickSort {

    public static int[] sort(int[] array) {

        array = sort_r(array, 0, array.length - 1);

        return array;
    }

    private static int[] sort_r(int[] array, int low, int high) {


        return array;
    }

    private static int[] partition(int[] part, int low, int high) {
        
        int pivot = (part.length - 1)/2;
        int temp = part[pivot];
        part[pivot] = part[high];
        part[high] = part[temp];
        


        return part;
    }
}
