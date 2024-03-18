package Leetcode5.S_20_12_2023.FEB_02;
public class MaximumGoodSubarraySum {
    public static long maximumSubarraySum(int[] nums, int k) {
        long maxSum = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            long sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (Math.abs(nums[i] - nums[j]) == k) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        return (maxSum == Long.MIN_VALUE) ? 0 : maxSum;
    }

    public static void main(String... args) {
        var nums = new int[]{999999980, 999999981, 999999982, 999999983, 999999984,
                             999999985, 999999986, 999999987, 999999988, 999999989,
                             999999990, 999999991, 999999992, 999999993, 999999994,
                             999999995, 999999996, 999999997, 999999998, 999999999};
        var k = 18;
        System.out.println(maximumSubarraySum(nums, k));
    }
}