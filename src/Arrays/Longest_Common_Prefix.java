package Arrays;
import java.util.Arrays;
public class Longest_Common_Prefix {
    public static String longestCommonPrefix(String[] strs) {
        /*if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int i = 1;
        while (i < strs.length) {
            if (strs[i].indexOf(prefix) != 0) {
                do {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "";
                    }
                } while (strs[i].indexOf(prefix) != 0);
            }
            i++;
        }
        return prefix;*/
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int i = 0;
        while (true) {
            if (!(i < Math.min(s1.length(), s2.length()))) break;
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return s1.substring(0,i);
    }
    public static void main(String[] args) {
        var strs = new String[]{"dog","racecar","car"};
        String commonPrefix = longestCommonPrefix(strs);
        if (!commonPrefix.isEmpty()) {
            System.out.println("The longest common prefix is: " + commonPrefix);
        } else {
            System.out.println("There is no common prefix among the input strings.");
        }
    }
}