package Arrays;
public class Linear_Search {
    public static void main(String[] args) {
        int [] nums = {4,5,6,2,9,12,69};
        int tgt = 2;
        int result = linearSearch(nums, tgt);
        if (result != -1)
        System.out.println("Element found at index:- "+result);
        else System.out.println("Element not found at any index. ");
    }
    private static int linearSearch(int[] nums, int tgt) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == tgt)
                return i;
        }
        return -1;
    }
}