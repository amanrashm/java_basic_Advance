package Strings;
public class LongestPalindrome {
    public static int longestPalindrome(String s) {
        var count = new int[128];
        for (var c: s.toCharArray())
            count[c]++;
        var ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
    public static void main(String... args) {
        var s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}