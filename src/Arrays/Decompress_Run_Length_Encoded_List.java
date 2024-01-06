package Arrays;
public class Decompress_Run_Length_Encoded_List {
    public static int[] decompressRLElist(int[] nums) {
        var n = nums.length;
        var size = 0;
        for (var i = 0; i < n; i += 2) {
            size += nums[i];
        }
        var arr = new int[size];
        var index = 0;
        for (var i = 0; i < n; i += 2) {
            var freq = nums[i];
            var val = nums[i + 1];
            while (freq-- > 0) {
                arr[index++] = val;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        var nums = new int []{ 1, 2, 3, 4 };
        for (int i : decompressRLElist(nums)) {
            System.out.print(i + " ");
        }
    }
}