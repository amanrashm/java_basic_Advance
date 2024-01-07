package Leetcode5.S_20_12_2023.Compete06_01_2024;
//A prefix nums[0..i] is sequential if, for all 1 <= j <= i, nums[j] = nums[j - 1] + 1.
// In particular, the prefix consisting only of nums[0] is sequential.
//Return the smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.
//input : var nums = new int[]{1,2,3,2,5}; var nums = new int[]{29,30,31,32,33,34,35,36,37};
// expected output 6 ; expected output 297
public class Smallest_Missing_Int_big_Then_Seq_Prefix_Sum {
    public static int missingInteger(int[] nums) {
        var sum = 0;
        var target = 0;
        boolean flag=false;
        for(int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[i] > nums[j]) {
                    sum += nums[i];
                }else{
                    for(var k = 0; k < nums.length-1; k+=2){
                        if(nums[k] < nums[k+1])
                            target = target + nums[k] + nums[k+1];
                    }
                }
                flag=true;
            }
            if(flag = true){
                target = Math.max(target,sum);
            }else{
                return target + nums[nums.length-1];
            }
        }
        return target+1;
    }
    public static void main(String[] args){
        var nums = new int[]{3,4,5,1,12,14,13};
        System.out.println(missingInteger(nums));
    }
}