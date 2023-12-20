package Leetcode5.S_20_12_2023;
/*Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0*/
public class Good_Pair {
    public static int numIdenticalPairs(int[] nums) {
        int good_pairs = 0;
        int n = nums.length;
        //time complexity O(N^2)
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(nums[i] == nums[j] & i < j){
                }
            }
        }



        return good_pairs;
    }
    public static void main(String[] args) {

    }
}
