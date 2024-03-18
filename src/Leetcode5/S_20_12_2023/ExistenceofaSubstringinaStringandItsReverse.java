package Leetcode5.S_20_12_2023;
/*
Given a string s, find any substring of length 2 which is also present in the reverse of s.

Return true if such a substring exists, and false otherwise.



Example 1:

Input: s = "leetcode"

Output: true

Explanation: Substring "ee" is of length 2 which is also present in reverse(s) == "edocteel".

Example 2:

Input: s = "abcba"

Output: true

Explanation: All of the substrings of length 2 "ab", "bc", "cb", "ba" are also present in reverse(s) == "abcba".

Example 3:

Input: s = "abcd"

Output: false

Explanation: There is no substring of length 2 in s, which is also present in the reverse of s.



Constraints:

1 <= s.length <= 100
s consists only of lowercase English letters.
* */
public class ExistenceofaSubstringinaStringandItsReverse {
    public static boolean isSubstringPresent(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            var sub = s.substring(i, i + 2);
            if (s.contains(sub) && s.contains(new StringBuilder(sub).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        var s1 = "leetcode";
        System.out.println("Example 1 Output: " + isSubstringPresent(s1));
        var s2 = "abcba";
        System.out.println("Example 2 Output: " + isSubstringPresent(s2));
        var s3 = "abcd";
        System.out.println("Example 3 Output: " + isSubstringPresent(s3));
    }
}
