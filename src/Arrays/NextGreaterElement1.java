package Arrays;
public class NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        var result = new int[nums1.length];
        for (var i : nums1) {
            var index = -1;
            for(var j : nums2) {
                if (nums1[i] == nums2[j]) {
                    index = j;
                    break;
                }
            }
            result[i] = GreaterElement(nums2, index);
        }
        return result;
    }
    public static int GreaterElement(int[] nums2, int index) {
        var nextGreater = -1;
        for (var j = index + 1; j < nums2.length; j++) {
            if (nums2[j] > nums2[index]) {
                nextGreater = nums2[j];
                break;
            }
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,1,2}, nums2 = {1,3,4,2};
        var result = nextGreaterElement(nums1, nums2);
        for (var item : result) {
            System.out.print(item + " ");
        }
    }
}
 /*for (var i = 0; i < nums1.length; i++) {
            var index = -1;
            for (var j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    index = j;
                    break;
                }
            }
            var nextGreater = -1;
            for (var j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }*/