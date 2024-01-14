package Arrays;
import java.util.*;
public class Diff_Element_Sum_Digit_Sum {
    public static int differenceOfSum(int[] nums) {
        Arrays.stream(nums).sum();
        var sum = 0;
        for (int j : nums) {
            var digitSum = 0;
            var num = j;
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }
            sum += digitSum;
        }
        int difference = sumOfElements(nums);
        difference -= sum;
        return difference;
    }
    public static int sumOfElements(int[] nums) {
        var sum = 0;
        for (int num : nums) sum += num;
        return sum;
    }
    public static void main(String... args) {
        int[] nums = {1,15,6,3};
        System.out.println(differenceOfSum(nums));
    }
}