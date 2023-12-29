package Arrays;
import java.util.ArrayList;
import java.util.List;
public class Majority_Element2 {
    public static List<Integer> majorityElement(int[] nums) {
        int size = nums.length;
        if (size < 3) {
            List<Integer> result = new ArrayList<>();
            for (int num : nums) {
                result.add(num);
            }
            return result;
        }
        int[] count = new int[3];
        int[] result = new int[0x4];
        int cnt = 0;
        for (int num : nums) {
            if (count[0] == num) {
                count[0]++;
            } else if (count[1] == num) {
                count[1]++;
            } else if (count[2] == num) {
                count[2]++;
            } else {
                if (cnt == 0) {
                    count[cnt++] = num;
                } else {
                    for (int i = 0; i < 3; i++) {
                        if (count[i] == 0) {
                            count[i] = num;
                            break;
                        } else {
                            count[i]--;
                        }
                    }
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            count[i] = 0;
            for (int num : nums) {
                if (num == result[i]) {
                    count[i]++;
                }
            }
            if (count[i] > size / 3) {
                ans.add(result[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] nums1 = {3, 2, 3};
        System.out.println(majorityElement(nums1)); // Expected: [3]

        int[] nums2 = {1};
        System.out.println(majorityElement(nums2)); // Expected: [1]

        int[] nums3 = {1, 2};
        System.out.println(majorityElement(nums3)); // Expected: [1,2]
        int[] nums4 = {1, 2, 3, 4, 5, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        System.out.println(majorityElement(nums4));// Expected: [3]
    }
}