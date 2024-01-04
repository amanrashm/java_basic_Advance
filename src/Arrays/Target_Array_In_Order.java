package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Target_Array_In_Order {
    public static int[] createTargetArray(int[] nums, int[] index) {
        var list = new ArrayList<Integer>();
        IntStream.range(0, nums.length).forEach(i -> list.add(index[i], nums[i]));
        int[] target = IntStream.range(0, nums.length).map(list::get).toArray();
        return target;
    }
    public static void main(String[] args) {
        var nums = new int[]{0,1,2,3,4};
        var index = new int[]{0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
}
