package DSAFundamentals;
public class Max_In_Array {
    public static int max(int[] arr) {
        var max = 0;
        for (var i = 0; i < arr.length-1 ; i += 2)
            max = Math.max(max,Math.max(arr[i],arr[i+1]));
        return max;
    }
    public static void main(String[] args) {
        var arr = new int[] {1, 2, 3, 4, 9, 5, 6, 7, 8};
        System.out.println(max(arr));
    }
}