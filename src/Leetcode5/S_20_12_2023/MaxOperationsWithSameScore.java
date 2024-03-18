package Leetcode5.S_20_12_2023;
public class MaxOperationsWithSameScore {
    public static int maxOperations(int[] nums) {
        var operations = 0;
        var sum = nums[0] + nums[1];
        var sum2 = 0;
        for (int i = 2; i < nums.length-1; i += 2) {
            sum2 = nums[i + 1] + nums[i];
            if (sum == sum2) {
                operations ++;
            }else break;
        }
        return operations+1;
    }
    public static void main(String[] args) {
        var nums1 = new int[]{3, 2, 1, 4, 5};
        System.out.println("Example 1 Output: " + maxOperations(nums1));
        var nums2 = new int[]{3, 2, 6, 1, 4};
        System.out.println("Example 2 Output: " + maxOperations(nums2));
        var nums3 = new int[]{1, 9, 7, 3, 2, 7, 4, 12, 2, 6};
        System.out.println("Example 3 Output: " + maxOperations(nums3));
        var nums4 = new int[]{1,1,1,1,1,1};
        System.out.println("Example 4 Output: " + maxOperations(nums4));
    }
}