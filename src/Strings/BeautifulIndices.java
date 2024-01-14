package Strings;
import java.util.List;
public class BeautifulIndices {
    // This is a brute force approach. It is not efficient.
    //TODO: Implement a more efficient approach.
    public static List<Integer> beautifulIndices(String s, String a, String b, int k) {
        var result = new java.util.ArrayList<Integer>();
        var aIndex = s.indexOf(a);
        var bIndex = s.indexOf(b);
        var aCount = 0;
        var bCount = 0;
        while (aIndex != -1) {
            aCount++;
            aIndex = s.indexOf(a, aIndex + 1);
        }
        while (bIndex != -1) {
            bCount++;
            bIndex = s.indexOf(b, bIndex + 1);
        }
        if (aCount > bCount) {
            var temp = a;
            a = b;
            b = temp;
        }
        var index = s.indexOf(a);
        while (index != -1) {
            var temp = s.substring(0, index) + b + s.substring(index + a.length());
            var count = 0;
            var i = 0;
            while (i < temp.length()) {
                var j = i + 1;
                while (j < temp.length() && temp.charAt(i) == temp.charAt(j)) {
                    j++;
                }
                count = Math.max(count, j - i);
                i = j;
            }
            if (count <= k) {
                result.add(index);
            }
            index = s.indexOf(a, index + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "isawsquirrelnearmysquirrelhouseohmy";
        String a = "my";
        String b = "squirrel";
        int k = 15;
        System.out.println(beautifulIndices(s, a, b, k));
    }
}