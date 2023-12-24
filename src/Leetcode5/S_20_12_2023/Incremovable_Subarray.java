package Leetcode5.S_20_12_2023;

public class Incremovable_Subarray {
    public static int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] tails = new int[51];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = tails[nums[i]];
            if (j == 0) {
                dp[i] = i + 1;
            } else {
                dp[i] = dp[j - 1] + i - j + 1;
            }
            count += dp[i];
            tails[nums[i]] = i + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int []  n = {8,7,6,6};
        System.out.println(incremovableSubarrayCount(n));
    }
}