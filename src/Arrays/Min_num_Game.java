package Arrays;
import java.util.Arrays;
public class Min_num_Game {
    public static int[] numberGame(int[] nums) {
        int [] arr = new int[nums.length];
        Arrays.sort(nums);
        if((nums.length & 1) == 0) {
            for (int i = 0; i < nums.length-1; i=i+2) {
                    arr[i] = nums[i+1];
                    arr[i+1] = nums[i];
                }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] n = {5,4,2,3} ;
        System.out.println(Arrays.toString(numberGame(n)));
    }
}