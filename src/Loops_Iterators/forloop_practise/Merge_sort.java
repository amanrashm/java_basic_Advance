package Loops_Iterators.forloop_practise;
public class Merge_sort {
    public static void main(String[] args) {
        int[] array = {3, 2, 8, 5, 100, 4, 900, 700};
        mergeSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }
    private static void mergeSort(int[] array, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(array, l, mid);
            mergeSort(array, mid + 1, r);
            merge(array, l, mid, r);
        }
    }
    private static void merge(int[] array, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        System.arraycopy(array, l, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 & j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}