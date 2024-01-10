package basic_java;
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n == 1) return 1;
        var dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(var i = 3; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }
    public static void main(String [] args){
        var n = 2;
        System.out.println(climbStairs(n));
    }
}