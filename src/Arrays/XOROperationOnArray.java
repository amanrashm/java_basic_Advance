package Arrays;
//You are given an integer n and an integer start.
//Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
//Return the bitwise XOR of all elements of nums.
public class XOROperationOnArray {
    public static int xorOperation(int n, int start) {
        var result = 0;
        for(var i = 0; i < n; i++) result ^= start + 2 * i;
        return result;
    }
    public static void main(String [] args){
        var n = 5;
        var start = 0;
        System.out.println(xorOperation(n, start));
    }
}