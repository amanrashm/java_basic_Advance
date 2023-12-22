package Strings;

public class longest_palindrome_Substring {
    public static String longestPalindrome(String s) {
        int start = 0, end = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int odd = expand(s, i, i);
            int even = expand(s, i, i+1);
            int length = Math.max(odd, even);
            if(length > end - start){
                start = i - (length-1)/2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end+1);
    }
    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        String str = "malayalammadam";
        System.out.println(longestPalindrome(str));
    }
}
