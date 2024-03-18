package Leetcode5.S_20_12_2023;
import java.util.HashSet;

public class SplitTheArray {
    public static boolean isPossibleToSplit(int[] nums) {
        /*var set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        int targetSize = nums.length / 2;
        return set.size() >= targetSize;*/
        var set1 = new HashSet<Integer>();
        var set2 = new HashSet<Integer>();

        for (var num : nums) {
            if (!set1.contains(num)) {
                set1.add(num);
            } else if (!set2.contains(num)) {
                set2.add(num);
            } else {
                return false;
            }
        }
        return set1.size() + set2.size() >= nums.length;    
    }

    public static void main(String[] args) {
        var nums = new int[]{6,1,3,1,1,8,9,2};
        System.out.println(isPossibleToSplit(nums));

        var nums2 = new int[]{1, 1, 1, 1};
        System.out.println(isPossibleToSplit(nums2));

        var nums3 = new int[]{1, 1, 2, 2, 3, 4};
        System.out.println(isPossibleToSplit(nums3));
    }
}
