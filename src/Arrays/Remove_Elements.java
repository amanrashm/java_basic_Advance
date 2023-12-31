package Arrays;

public class Remove_Elements {
    public static int removeElement(int[] nums, int val) {
        var count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        var nums = new int[]{0,1,2,2,3,0,4,2};
        var val = 2;
        System.out.println(removeElement(nums, val));
    }
}
