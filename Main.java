public class Main {
    
    public static void main(String[] args) {
        
        int[] unSorted = {9, 1, 5, 6, 4, 3, 7, 2, 10};
        int[] sorted = InsertionSort.sort(unSorted);

        for (int num : sorted) {
            System.out.println(num);
        }
    }
}
