package DSAFundamentals;

import java.util.Arrays;

public class Selection_Sort {
    public static void selectionSort(int[] arr) {
        for (var i = 0; i < arr.length-1; i++) {
            var min = i;
            for (var j = i+1; j < arr.length; j++)
                if (arr[j] < arr[min])
                    min = j;
            var temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        var arr = new int[] {5, 4, 3, 2, 1};
        selectionSort(arr);
        Arrays.stream(arr).mapToObj(j -> j + " ").forEachOrdered(System.out::print);
    }
}