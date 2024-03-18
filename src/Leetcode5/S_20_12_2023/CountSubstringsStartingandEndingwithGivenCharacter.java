package Leetcode5.S_20_12_2023;

public class CountSubstringsStartingandEndingwithGivenCharacter {
    public static long countSubstrings(String s, char c) {
        var count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {

            }
        }
        return count;
    }
    public static void main(String... args){
        var s1 = "abada";// output: 6
        var c1 = 'a';
        System.out.println("Example 1 Output: " + countSubstrings(s1, c1));
        var s2 = "zzz";// output: 6
        var c2 = 'z';
        System.out.println("Example 2 Output: " + countSubstrings(s2, c2));
        var s3 = "goxo"; // output: = 0;
        var c3 = 'q';
        System.out.println("Example 3 Output: " + countSubstrings(s3, c3));
    }
}
