package DSAFundamentals;
public class Print_First_Index_where_X_Is_Occuring {
    public static int firstIndex(int[] arr, int idx, int x) {
        if (idx == arr.length) return -1;
        if (arr[idx] == x) return idx;
        return firstIndex(arr, idx + 1, x);
    }
    public static void main(String[] args) {
        var arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(firstIndex(arr, 0, 3));
    }
}