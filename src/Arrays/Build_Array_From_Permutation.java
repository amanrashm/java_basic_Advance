package Arrays;
import java.util.Arrays;
public class Build_Array_From_Permutation {
    public static int[] buildArray (int [] nums){
        int [] arr = new int[nums.length];
        int i =0;
        for (int num : nums){
            arr[i] = nums[num];
            i++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] n = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(n)));
    }
}