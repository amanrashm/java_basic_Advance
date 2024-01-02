package Arrays;
import java.util.*;
public class Sort_Find_Index {
    // need to understand again
    public static List<Integer> targetIndices(int[] nums, int target) {
        var targets = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (var num : nums)
            if(num == target) targets.add(num);
        return targets;
    }
    public static void main(String[] args) {
        var nums = new int[]{2,1,6,3,8,4,9,5};
        System.out.println(targetIndices(nums,4));
    }
}
