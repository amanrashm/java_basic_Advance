package Leetcode5.S_20_12_2023;
public class LongestCommonPrefix {
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        var maxLength = 0;
        var strX = " ";
        var strY = " ";
        for (var x : arr1)
            strX = String.valueOf(x);
        for (var y : arr2)
            strY = String.valueOf(y);
        var commonPrefixLength = findCommonPrefixLength(strX, strY);
        maxLength = Math.max(maxLength, commonPrefixLength);
        return maxLength;
    }
    private static int findCommonPrefixLength(String str1, String str2) {
        var minLength = Math.min(str1.length(), str2.length());
        var commonPrefixLength = 0;
        for (var i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefixLength++;
            } else {
                break;
            }
        }
        return commonPrefixLength;
    }
    public static void main(String... args) throws Exception {
        var arr1 = new int[]{1, 10, 100};
        var arr2 = new int[]{1000};
        System.out.println(longestCommonPrefix(arr1, arr2));
        var vrr1 = new int[]{1, 2, 3};
        var vrr2 = new int[]{4, 4, 4};
        System.out.println(longestCommonPrefix(vrr1, vrr2));
        var brr1 = new int[]{1, 3};
        var brr2 = new int[]{32, 22};
        System.out.println(longestCommonPrefix(brr1, brr2));
    }
}