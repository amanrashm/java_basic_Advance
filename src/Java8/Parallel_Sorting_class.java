package Java8;
public class Parallel_Sorting_class {
    public static void main(String[] args) {
        // Creating an integer array
        int[] arr = { 5, 8, 1, 0, 6, 9, 50, 3, 2, 7, 4 };
        // Iterating array elements
        // sorting Array Parallel
        java.util.Arrays.parallelSort(arr);
        // Iterating array elements
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}