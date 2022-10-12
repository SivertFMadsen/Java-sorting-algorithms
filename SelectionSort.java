public class SelectionSort extends Sorter {

    @Override
    String algorithmName() {
        return "Merge";
    }

    @Override
    void sort() {

        sortHere(A);
    }
    
    public int[] sortHere(int[] array) {

        for (int i = 0; lt(i, array.length); i++) {
            int smallest = array[i];
            int smallestIndex = i;

            for (int j = i; lt(j, array.length); j++) {

                if (array[j] < smallest) {
                    smallest = array[j];
                    smallestIndex = j;
                }
            }

            swap(smallestIndex, i);
            // array[smallestIndex] = array[i];
            // array[i] = smallest;
        }
        return array;
    }
}
