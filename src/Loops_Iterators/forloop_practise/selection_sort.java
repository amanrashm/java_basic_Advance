package Loops_Iterators.forloop_practise;
import java.util.Arrays;
public class  selection_sort {
    public static int[] selectionSort(int [] arrays){
        int n = arrays.length;
        int [] nums = Arrays.copyOf(arrays, arrays.length);
        int minIndex =-1;
        for (int i = 0; i < n-1; i++) {
            minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(nums[minIndex] > nums[j]) minIndex = j;
            }
            nums[i] = nums[i] ^ nums[minIndex];
            nums[minIndex] = nums[i] ^ nums[minIndex];
            nums[i] = nums[i] ^ nums[minIndex];
        }
        return nums;
    }
    public static void main(String[] args) {
        int [] n = {3,10,2,5,8,4,1};
        System.out.println(Arrays.toString(selectionSort(n)));
    }
}