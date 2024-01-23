package Arrays;
public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        var morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
        var set = new java.util.HashSet<String>();
        for (var word : words) {
            var sb = new StringBuilder();
            for (var c : word.toCharArray()) {
                sb.append(morse[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
    public static void main(String[] args) {
        var words = new String[]{"gin", "zen", "gig", "msg"};
        var res = uniqueMorseRepresentations(words);
        System.out.println(res);
    }
}