public class Main {
    
    public static void main(String[] args) {
        
        int[] unSorted = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] sorted = InsertionSort.sort(unSorted);

        for (int num : sorted) {
            System.out.println(num);
        }
    }
}
