package Arrays;
public class Pair_Absolute_Difference {
    public static int countKDifference(int[] nums, int k) {
        var count = 0;
        for(var i=0; i<nums.length; i++){
            for(var j=i+1; j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String... args) {
        var nums = new int[]{1,2,2,1};
        var k = 1;
        System.out.println(countKDifference(nums, k));
    }
}
/* TODO: learn this approach
    static
final int kMax = 100;
    int ans = 0;
    int[] count = new int[kMax + 1];

    for (final int num : nums)
      ++count[num];

    for (int i = k + 1; i <= kMax; ++i)
      ans += count[i] * count[i - k];

    return ans;*/