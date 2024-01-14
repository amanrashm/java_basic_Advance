package Arrays;
public class Linear_Search {
    public static int linearSearch(int[] nums, int tgt) {
        int n = nums.length;
        var i = 0;
        for (; i < n; i+=3)
            if (nums[i] == tgt | nums[i+1] == tgt | nums[i+2] == tgt) return i;
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {4,5,6,2,9,12,69};
        int tgt = 2;
        int result = linearSearch(nums, tgt);
        if (result != -1)
            System.out.println("Element found at index:- "+result);
        else System.out.println("Element not found at any index. "+result);
    }
}