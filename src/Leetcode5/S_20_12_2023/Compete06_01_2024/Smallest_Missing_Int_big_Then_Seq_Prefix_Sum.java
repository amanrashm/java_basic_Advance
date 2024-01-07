package Leetcode5.S_20_12_2023.Compete06_01_2024;
//A prefix nums[0..i] is sequential if, for all 1 <= j <= i, nums[j] = nums[j - 1] + 1.
// In particular, the prefix consisting only of nums[0] is sequential.
//Return the smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.
//input : var nums = new int[]{1,2,3,2,5}; var nums = new int[]{29,30,31,32,33,34,35,36,37};
// expected output 6 ; expected output 297
import java.util.Arrays;
public class Smallest_Missing_Int_big_Then_Seq_Prefix_Sum {
    public static int missingInteger(int[] nums) {
        var countSum = nums[0];
        for (var i = 1; i < nums.length; i++)
            if (nums[i - 1] + 1 == nums[i]) countSum += nums[i];
            else break;
        Arrays.sort(nums);
        for (var num : nums) {
            if (countSum == num) {
                countSum++;
            }
        }
        return countSum;
    }
    public static void main(String[] args){
        var nums = new int[]{3,4,5,1,12,14,13};
        System.out.println(missingInteger(nums));
    }
}