package Strings;
public class ConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        var result = 0;
        var targetMask = getMask(allowed);
        for (var w : words) {
            var mask = getMask(w);
            if ((mask & ~targetMask) == 0) result++;
        }
        return result;
    }
    private int getMask(String s) {
        var result = 0;
        for (var i = 0; i < s.length(); i++) result |= 1 << (s.charAt(i) - 'a');
        return result;
    }
    public static void main(String[] args) {
        var allowed = "ab";
        var words = new String[]{"ad","bd","aaab","baa","badab"};
        var res = new ConsistentStrings().countConsistentStrings(allowed, words);
        System.out.println(res);
    }
}
/*var count = 0;
        for (String word : words) {
            var bool = IntStream.range(0, word.length()).allMatch(i -> allowed.contains(String.valueOf(word.charAt(i))));
            if (bool) {
                count++;
            }
        }
        return count;*/