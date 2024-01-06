package Loops_Iterators.WhileLoop_practise;
public class Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length && nums[i] < target) i++;
        return i;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        System.out.println(searchInsert(nums, target));
    }
}