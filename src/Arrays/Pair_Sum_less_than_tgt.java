package Arrays;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class Pair_Sum_less_than_tgt {
    public static int countPairs(List<Integer> nums, int target) {
        var count = 0;
        var right = nums.size() - 1;
        var left = 0;
        nums.sort(Comparator.naturalOrder());
        while(left < right){
            if(nums.get(left) + nums.get(right) < target){
                count += (right - left);
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        var nums = Arrays.asList(-1,1,2,3,1);
        var target = 2;
        System.out.println(countPairs(nums, target));
    }
}