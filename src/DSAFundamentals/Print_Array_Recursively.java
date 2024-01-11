package DSAFundamentals;
public class Print_Array_Recursively {
    public static void printArray(int[] arr, int idx) {
        if (idx == arr.length) return;
        System.out.println(arr[idx]);
        printArray(arr, idx + 1);
    }
    public static void main(String[] args) {
        var arr = new int[] {1, 2, 3, 4, 5};
        printArray(arr, 0);
    }
}