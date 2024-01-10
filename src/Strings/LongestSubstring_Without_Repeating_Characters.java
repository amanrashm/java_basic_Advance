package Strings;
public class LongestSubstring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        var map = new int[128];
        var left = 0; var right = 0; var count = 0; var d = 0;
        while (right < s.length()) {
            if (map[s.charAt(right++)]++ > 0) count++;
            while (count > 0) if (map[s.charAt(left++)]-- > 1) count--;
            d = Math.max(d, right - left);
        }
        return d;
    }
    public static void main(String[] args){
        var s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}