package Leetcode5.S_20_12_2023;
public class MatchAPattern {
    public static int countMatchingSubarrays(int[] nums, int[] pattern) {
        var n = nums.length;
        var m = pattern.length;
        var count = 0;
        for (var i = 0; i <= n - m && i + m < n; i++) {
            if (matchesPattern(nums, pattern, i)) {
                count++;
            }
        }
        return count;
    }
    private static boolean matchesPattern(int[] nums, int[] pattern, int startIndex) {
        for (var k = 0; k < pattern.length; k++) {
            var num1 = nums[startIndex + k];
            var num2 = nums[startIndex + k + 1];
            if (pattern[k] == 1 && num1 >= num2) {
                return false;
            } else if (pattern[k] == 0 && num1 != num2) {
                return false;
            } else if (pattern[k] == -1 && num1 <= num2) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        var nums1 = new int[]{1, 2, 3, 4, 5, 6};
        var pattern1 = new int[]{1, 1};
        System.out.println(countMatchingSubarrays(nums1, pattern1));

        var nums2 = new int[]{1,4,4,1,3,5,5,3};
        var pattern2 = new int[]{1,0,-1};
        System.out.println(countMatchingSubarrays(nums2, pattern2));
    }
}