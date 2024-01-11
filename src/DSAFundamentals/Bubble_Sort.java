package DSAFundamentals;
public class Bubble_Sort {
    public static void bubbleSort(int[] arr) {
        for (var i = 0; i < arr.length - 1; i++)
            for (var j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    var temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
    public static void main(String[] args) {
        var arr = new int[] {5, 4, 3, 2, 1};
        bubbleSort(arr);
        for (var i : arr)
            System.out.print(i + " ");
    }
}