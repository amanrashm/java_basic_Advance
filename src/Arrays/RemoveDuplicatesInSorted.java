package Arrays;
public class RemoveDuplicatesInSorted {
    public static int removeDuplicates(int[] nums) {
        var newIndex = 1;
        for (var i = 0; i < nums.length-1; i++) {
            if(nums[i] < nums[i + 1]){
                nums[newIndex]  = nums[i + 1];
                newIndex++;
            }
        }
        return newIndex;
    }
    public static void main(String[] args) {
        int [] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}