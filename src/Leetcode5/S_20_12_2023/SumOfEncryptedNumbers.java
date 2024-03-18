package Leetcode5.S_20_12_2023;
public class SumOfEncryptedNumbers {
    public static int sumOfEncryptedInt(int[] nums) {
        var sum = 0;
        for (var num : nums) {
            var str = String.valueOf(num);
            var max = str.charAt(0);
            for (var i = 1; i < str.length(); i++) {
                max = (char) Math.max(max, str.charAt(i));
            }
            var encrypted = Integer.parseInt(String.valueOf(max).repeat(str.length()));
            sum += encrypted;
        }
        return sum;
    }

    public static void main(String[] args) {
        var nums1 = new int[]{1, 2, 3};
        System.out.println("Example 1 Output: " + sumOfEncryptedInt(nums1));
        var nums2 = new int[]{10, 21, 31};
        System.out.println("Example 2 Output: " + sumOfEncryptedInt(nums2));
    }
}