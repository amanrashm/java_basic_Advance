package Arrays;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class Left_Right_Sum_Difference {

    // using two pointer rule
    public static int[] leftRightDifference(int[] nums) {
        var answer = new int[nums.length];
        var left = new int[nums.length];
        var right = new int[nums.length];
        left[0] = 0;
        right[nums.length-1] = 0;
        var sum = 0;
        var a = 0;
        for (int i = 0; i < nums.length-1; i++) {
            sum += nums[i];
            left[i + 1] = sum;
        }
        sum = 0;
        for (int i = nums.length-1; i > 0; i--) {
            sum += nums[i];
            right[i - 1] = sum;
        }
        for (var i = 0; i < nums.length; i++)
            answer[a++] = Math.abs(left[i] - right[i]);
        return answer;
    }
    public static void main(String[] args) {
        var nums = new int[]{10,4,8,3};
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
