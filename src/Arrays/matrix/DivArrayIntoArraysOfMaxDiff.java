package Arrays.matrix;
import java.util.Arrays;
public class DivArrayIntoArraysOfMaxDiff {
    public static int[][] divideArray(int[] nums, int k) {
        var arr= new int[nums.length/3][3];
        Arrays.sort(nums);
        var c = 0; var f=0;
        for(var i = 0; i <arr.length; i++){
            for(var j = 0;j < 3;j++){
                arr[i][j]=nums[c++];
            }
            if(arr[i][1] - arr[i][0] <= k & arr[i][2] - arr[i][0] <= k & arr[i][1] - arr[i][2] <= k){
                f++;
            }
        }
        if(f!=arr.length){
            return new int[0][];
        }
        return arr;
    }
    public static void main(String... args){
        var nums = new int[]{1,3,4,8,7,9,3,5,1};
        var k = 2;
        System.out.println(Arrays.deepToString(divideArray(nums, k)));
    }
}