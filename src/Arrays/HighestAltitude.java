package Arrays;
public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        var max = 0;
        var sum = 0;
        for (var j : gain) {
            sum += j;
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        var gain = new int[]{-5,1,5,0,-7};
        var res = largestAltitude(gain);
        System.out.println(res);
    }
}