package Arrays;
import java.util.Arrays;
public class Array_Suffle_X1_Y1 {
    //input:- x1,x2,x3,y1,y2,y3 = output:- x1,y1,x2,y2,x3,y3
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0,j = n, c = 0;
        while(j < 2*n){
            result[c++] = nums[i++];
            result[c++] = nums[j++];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] n = {1,2,3,4,4,3,2,1};
            System.out.println(Arrays.toString(shuffle(n, 4)));
    }
}