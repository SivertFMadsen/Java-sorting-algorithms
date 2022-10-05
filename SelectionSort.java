public class SelectionSort {
    
    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int smallest = array[i];
            int smallestIndex = i;

            for (int j = i; j < array.length; j++) {

                if (array[j] < smallest) {
                    smallest = array[j];
                    smallestIndex = j;
                }
            }
            array[smallestIndex] = array[i];
            array[i] = smallest;
        }
        return array;
    }
}
