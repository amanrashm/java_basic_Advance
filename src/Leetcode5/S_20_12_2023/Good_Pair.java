package Leetcode5.S_20_12_2023;
import java.util.HashMap;
import java.util.Map;

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
        var count=0;
        Map<Integer,Integer> map = new HashMap<>();
        for (var val: nums)
            map.put(val,map.getOrDefault(val,0)+1);
        for (Map.Entry<Integer,Integer> m: map.entrySet()) {
            var n=m.getValue();
            var sum = ((n-1)*n)/2;
            count += sum;
        }
        return count;
    }
    public static void main(String[] args) {
        var nums = new int[]{1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }
}