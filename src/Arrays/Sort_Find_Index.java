package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort_Find_Index {
    public static List<Integer> targetIndices(int[] nums, int target) {
        var targets = new ArrayList<Integer>();
        Arrays.sort(nums);
        for (int num : nums)
            if(num == target) targets.add(num);
        return targets;
    }
    public static void main(String[] args) {
        int [] nums = {2,1,6,3,8,4,9,5};
        System.out.println(targetIndices(nums,4));
    }
}
