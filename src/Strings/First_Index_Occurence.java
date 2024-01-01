package Strings;

import java.util.stream.IntStream;

public class First_Index_Occurence {
    public static int strStr(String haystack, String needle) {
        var string1 = haystack.length();
        var string2 = needle.length();
        return IntStream.range(0, string1 - string2 + 1)
                .filter(i -> haystack.substring(i, i + string2)
                        .equals(needle)).findFirst().orElse(-1);
    }
    public static void main(String[] args) {
        var haystack = "leetcode";
        var needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }
}