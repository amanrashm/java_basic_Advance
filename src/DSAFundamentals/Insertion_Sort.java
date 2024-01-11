package DSAFundamentals;
public class Insertion_Sort {
    public static void insertionSort(int[] arr) {
        for (var i = 1; i < arr.length; i++) {
            var key = arr[i];
            var j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        var arr = new int[] {5, 4, 3, 2, 1};
        insertionSort(arr);
        for (var i : arr)
            System.out.print(i + " ");
    }
}