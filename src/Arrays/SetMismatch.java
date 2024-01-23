package Arrays;
public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        var res = new int[nums.length + 1];
        for (var num : nums) {
            res[num]++;
        }
        var duplicate = 0;
        var missing = 0;
        for (var i = 1; i < res.length; i++) {
            if (res[i] == 2) {
                duplicate = i;
            }
            if (res[i] == 0) {
                missing = i;
            }
        }
        return new int[]{duplicate, missing};
        /*var res = new int[2];
        var n = nums.length;
        var set = new java.util.HashSet<Integer>();
        for (var num : nums) {
            if (set.contains(num)) {
                res[0] = num;
            }
            set.add(num);
        }
        for (var i = 1; i <= n; i++)
            if (!set.contains(i)) {
                res[1] = i;
                break;
            }
        return res;*/
    }
    public static void main(String[] args) {
        var nums = new int[]{1,2,2,4};
        var res = findErrorNums(nums);
        System.out.println(res[0] + " " + res[1]);
    }
}