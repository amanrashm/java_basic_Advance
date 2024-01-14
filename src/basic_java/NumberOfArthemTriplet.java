package basic_java;
public class NumberOfArthemTriplet {
    public static int arithmeticTriplets(int[] nums, int diff) {
        var count = 0;
        for(var i = 0; i < nums.length; i++){
            for(var j = i+1; j < nums.length; j++){
                for(var k = j+1; k < nums.length; k++){
                    if(nums[j] - nums[i] == diff && nums[k] - nums[j] == diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        var nums = new int[] {4,5,6,7,8,9};
        var diff = 2;
        System.out.println(arithmeticTriplets(nums, diff));
    }
}