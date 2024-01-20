package basic_java;
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n == 1) return 1;
        var cs = new int[n+1];
        cs[1] = 1;
        cs[2] = 2;
        for(var i = 3; i <= n; i++) cs[i] = cs[i - 1] + cs[i - 2];
        return cs[n];
    }
    public static void main(String [] args){
        var n = 5;
        System.out.println(climbStairs(n));
    }
}