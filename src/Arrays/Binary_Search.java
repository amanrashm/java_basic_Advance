package Arrays;
public class Binary_Search {
    private static int BinarySearch(int[] nums, int tgt) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == tgt){
                return mid;
            } else if (nums[mid] < tgt) {
                left = mid + 1;
            }else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {2,4,5,6,7,8,9};
        int tgt = 9;

        int result = BinarySearch(nums, tgt);
        if (result != -1)
            System.out.println("Element found at index:- "+result);
        else System.out.println("Element not found at any index. ");
    }
}