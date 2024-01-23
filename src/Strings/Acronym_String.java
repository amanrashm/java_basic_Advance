package Strings;
import java.util.Iterator;
import java.util.List;
public class Acronym_String {
    public static boolean isAcronym(List<String> words, String s) {
        var bool = false;
        var sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.charAt(0));
        }
        var res = sb.toString();
        if(res.equals(s)) {
            bool = true;
        }
        return bool;
    }
    public static void main(String[] args) {
        var words = List.of("an","apple");
        var s = "a";
        var res = isAcronym(words, s);
        System.out.println(res);
    }
}