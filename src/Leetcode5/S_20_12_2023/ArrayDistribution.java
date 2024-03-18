package Leetcode5.S_20_12_2023;
import java.util.ArrayList;

public class ArrayDistribution {
    public static int[] resultArray(int[] nums) {
        var arr1 = new ArrayList<Integer>();
        var arr2 = new ArrayList<Integer>();
        arr1.add(nums[0]);
        for (int i = 1; i < nums.length-1; i+=2) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr2.add(nums[i]);
            } else {
                arr1.add(nums[i]);
            }
        }
        int[] result = new int[arr1.size() + arr2.size()];
        int index = 0;
        for (int num : arr1) {
            result[index++] = num;
        }
        for (int num : arr2) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        var nums1 = new int[]{2,1,3};
        System.out.println(resultArray(nums1));
    }
}