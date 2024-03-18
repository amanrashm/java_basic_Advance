package Leetcode5.S_20_12_2023.FEB_02;
import java.util.Arrays;
public class Type_of_Triangle_II {
    public static String triangleType(int[] nums) {
        var type = " ";
        var i = 0;
        Arrays.sort(nums);
        var sum = nums[i] + nums[i+1];
        if(!(nums.length == 3)) {
            type = "none";
        }
        else if(sum < nums[i+2] | sum == nums[i+2]){
            type = "none";
        }
        else if(nums[i] == nums[i+1] & nums[i+1] == nums[i+2]){
            type = "equilateral";
        }
        else if ((nums[i] == nums[i+1]) | ( nums[i+1] == nums[i+2]) | nums[i] == nums[i+2])
            type = "isosceles";
        else
            type = "scalene";
        return type;
    }
    public static void main(String... args){
        var nums = new int[]{8,4,2};
        System.out.println(triangleType(nums));
    }
}