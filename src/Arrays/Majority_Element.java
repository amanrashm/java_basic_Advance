package Arrays;

public class Majority_Element {
    public static int majorityElement(int[] nums) {
            int ans = nums[0];
            int count = 1;
            int size = nums.length;
            for (int i = 1; i < size; i++) {
                if (nums[i] == ans) {
                    count++;
                } else {
                    count--;
                    if (count == 0) {
                        ans = nums[i];
                        count = 1;
                    }
                }
            }
            return ans;
    }
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
