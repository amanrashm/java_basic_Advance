package Leetcode5.S_20_12_2023;
public class CountPrefixAndSuffixPairsI {
    public static int countPrefixSuffixPairs(String[] words) {
        var count = 0;
        var n = words.length;
        for (var i = 0; i < n; i++) {
            var word1 = words[i];
            for (var j = i + 1; j < n; j++) {
                var word2 = words[j];
                if (isPrefixAndSuffix(word1, word2)) {
                    count++;
                }
            }
        }
        return count;
    }
    private static boolean isPrefixAndSuffix(String str1, String str2) {
        var len1 = str1.length();
        var len2 = str2.length();
        if (len1 > len2) {
            return false;
        }
        for (var i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i) || str1.charAt(i) != str2.charAt(len2 - len1 + i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String... args){
        var words = new String[]{"pa","papa","ma","mama"};
        System.out.println(countPrefixSuffixPairs(words));
        var word1 = new String[]{"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(word1));
        var word2 = new String[]{"abab","ab"};
        System.out.println(countPrefixSuffixPairs(word2));
    }
}