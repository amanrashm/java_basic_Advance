package Strings;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        /*var left = 0;
        var right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;*/
        var left = 0;
        var right = s.length() - 1;
        while (left < right) {
            char s1 = s.charAt(left);
            char s2 = s.charAt(right);
            if (s1 < 48 || (s1 > 57 && s1 < 65) || (s1 > 90 && s1 < 97) || s1 > 122) {
                left++;
            } else if (s2 < 48 || (s2 > 57 && s2 < 65) || (s2 > 90 && s2 < 97) || s2 > 122) {
                right--;
            } else {
                if (s1 >= 65 && s1 <= 90) {
                    s1 += 32;
                }
                if (s2 >= 65 && s2 <= 90) {
                    s2 += 32;
                }
                if (s1 != s2) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String [] args){
        var s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}