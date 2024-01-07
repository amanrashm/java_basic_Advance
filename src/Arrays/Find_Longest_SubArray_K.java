package Arrays;
// Given an array of integers nums and an integer k,
// return the maximum length of a subarray that sums to k.
// using Sliding Window Technique
public class Find_Longest_SubArray_K {
    public static int findLength(int[] nums, int k) {
        int left = 0;
        int curr = 0;
        int ans = 0;
        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr > k) {
                curr -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,7,4,2,1,1,5};
        int k = 8;
        System.out.println(findLength(nums, k));
    }
}